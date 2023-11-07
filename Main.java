package day30soalan;

public class Main {
    
    public static void main(String[] args) {
        // Jumlah awal piring yang disewakan oleh Rendi
        int jumlahAwalPiring = 6 * 144;

        // Jumlah piring yang dipinjam oleh Khanif
        int piringDipinjamKhanif = 4 * 12;

        // Jumlah piring yang dipinjam oleh Rindi
        int piringDipinjamRindi = 2 * 144;

        // Menghitung jumlah piring yang kini ada di tangan Rendi
        int jumlahPiringRendi = jumlahAwalPiring - (piringDipinjamKhanif + piringDipinjamRindi);

        // Menampilkan hasil
        System.out.println("Jumlah piring yang kini ada di tangan Rendi: " + jumlahPiringRendi);
    }
    
}