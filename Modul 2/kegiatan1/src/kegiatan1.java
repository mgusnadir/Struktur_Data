import java.util.ArrayList;

public class kegiatan1 {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        // tambahkan hewan ke dalam ArrayList
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");
        System.out.println("\nArrayList hewan : " + hewan);

        // tambahkan elemen baru dan hitung jumlah elemen "Bebek"
        hewan.add("Badak");
        hewan.add("Bebek");
        int jumlahBebek = 0;
        for (int i = 0; i < hewan.size(); i++) {
            if (hewan.get(i).equals("Bebek")) {
                jumlahBebek++;
            }
        }
        System.out.println("\nOutput : " + hewan);
        System.out.println("Jumlah Bebek: " + jumlahBebek);
        int indexBebekPertama = hewan.indexOf("Bebek");
        int indexBebekKedua = hewan.lastIndexOf("Bebek");
        System.out.println("Posisi Index : " + indexBebekPertama+ ", "+indexBebekKedua);

        // hapus posisi "Bebek" yang pertama
        hewan.remove("Bebek");
        System.out.println("\nOutput : " + hewan);

        // tampilkan elemen pada index ke-0 dan ke-2, lalu hapus index ke-0
        System.out.println("\nIndex ke-0 : " + hewan.get(0));
        System.out.println("Index ke-2 : " + hewan.get(2));
        hewan.remove(0);
        System.out.println("Output : " + hewan);

        // ubah index ke-0 dari "Cicak" menjadi "Ular", tambahkan elemen baru pada index ke-2 dengan "Itik"
        hewan.set(0, "Ular");
        hewan.add(2, "Itik");
        System.out.println("\nOutput : " + hewan);

        // hapus elemen di antara index ke-1 dan ke-5
        hewan.subList(2, 5).clear();
        System.out.println("\nOutput : " + hewan);

        // tampilkan elemen pertama dan terakhir, serta jumlah elemen pada ArrayList
        System.out.println("\nElemen pertama: " + hewan.get(0));
        System.out.println("Elemen terakhir: " + hewan.get(hewan.size() - 1));
        System.out.println("Jumlah elemen: " + hewan.size());

        // cari posisi index dari "Badak"
        int indexBadak = hewan.indexOf("Badak");
        System.out.println("\nIndex Badak: " + indexBadak);
        System.out.println("\n");
    }
}