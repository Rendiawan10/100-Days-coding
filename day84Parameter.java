package pkg100_days_of_coding;
public class day84Parameter {
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    static int tambah(int angka1, int angka2) {
        return angka1 + angka2;
    }
    public static void main(String[] args) {
        sapa("Rendiawan");

        int hasil = tambah(5, 7);
        System.out.println("Hasil penambahan adalah: " + hasil);
        
    }
    
}
