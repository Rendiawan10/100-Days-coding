topackage day26fungsii;

public class Main {
    // Fungsi sederhana yang mengembalikan nilai
    public static int tambah (int angka1, int angka2) {
        return angka1 + angka2;
    }

    // Fungsi tanpa nilai pengembalian
    public static void cetakPesan(String pesan) {
        System.out.println(pesan);
    }

    public static void main(String[] args) {
        int hasilPenambahan = tambah(5, 7);
        cetakPesan("Hasil penambahan: " + hasilPenambahan);
    }
    
}
