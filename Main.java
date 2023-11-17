package day40;

public class Main {
    
    public static void main(String[] args) {
        // Menampilkan NIM
        String nim = "D0223045";
        System.out.println("Nim: " + nim);

        // Menampilkan Nama
        String nama = "RENDIAWAN";
        String karakterDariNama = ambilKarakterDariNama(nama);
        System.out.println("Nama: " + karakterDariNama);
    }

    // Fungsi untuk mengambil 5 karakter dimulai dari karakter ke-1 dari nama
    private static String ambilKarakterDariNama(String nama) {
        if (nama.length() >= 1) {
            return nama.substring(0, 5); // Mengambil karakter ke-1 hingga ke-5
        } else {
            return "Nama terlalu pendek";
        }
    }
    
}