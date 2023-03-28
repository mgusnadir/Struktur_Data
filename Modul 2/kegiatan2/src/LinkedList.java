public class LinkedList {
    
    // Mendefinisikan node yang ada pada linked list
    class Node {
        int data;
        Node next;
 
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
 
    // Mendefinisikan head dan tail dari linked list
    public Node head = null;
    public Node tail = null;
 
    // Menambahkan node baru pada linked list
    public void tambahNode(int data)
    {
        Node newNode = new Node(data);
 
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
 
    // Mengurutkan isi linked list secara ascending
    public void urutkanList()
    {
        Node current = head;
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                Node index = current.next;
 
                while (index != null) {
                    if (current.data > index.data) {
                        int temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
 
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // Menampilkan isi linked list
    public void tampilkanList()
    {
        Node current = head;
 
        if (head == null) {
            System.out.println("List kosong");
            return;
        }
 
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
 
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
 
        list.tambahNode(8);
        list.tambahNode(7);
        list.tambahNode(1);
        list.tambahNode(4);
        list.tambahNode(6);
        list.tambahNode(2);
        list.tambahNode(3);
 
        System.out.print("\nSebelum\t: ");
        list.tampilkanList();
        list.urutkanList();
        System.out.print("Sesudah\t: ");
        list.tampilkanList();
    }
}