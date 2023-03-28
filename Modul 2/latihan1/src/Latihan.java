import java.util.ArrayList;

public class Latihan {
    public static void main(String[] args) throws Exception {

        ArrayList <String> Hewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println("\nHewan : "+Hewan);

        ArrayList <String> DeleteHewan = new ArrayList<>();

        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.println("Hewan Yang Dihapus : "+DeleteHewan);
        Hewan.removeAll(DeleteHewan);
        System.out.println("Output Hewan : "+Hewan);

    }
}
