import java.util.LinkedList;
import java.util.Queue;

public class Mainqueue {

    public void queueExample (){
        Queue queue = new LinkedList<>();
        
        queue.add("Java");
        queue.add("Dotnet");
        queue.add("PHP");
        queue.add("HTML");
        System.out.println("remove\t: "+queue.remove());
        System.out.println("element\t: "+queue.element());
        System.out.println("poll\t: "+queue.poll());
        System.out.println("peek\t: "+queue.peek());
    }

    public static void main(String[] args) throws Exception {
        new Mainqueue(). queueExample();
    }

}
