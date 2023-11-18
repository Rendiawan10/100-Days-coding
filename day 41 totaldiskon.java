package day41diskon;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan harga barang
        System.out.print("Harga Barang: Rp. ");
        double hargaBarang = scanner.nextDouble();

        // Meminta pengguna memasukkan persentase diskon
        System.out.print("Diskon (%): ");
        double persentaseDiskon = scanner.nextDouble();

        // Menghitung diskon dalam bentuk persentase dan nilai absolut
        double diskonPersen = hargaBarang * (persentaseDiskon / 100);
        double diskonRupiah = Math.min(diskonPersen, 1000); // Batasan diskon maksimal Rp. 1000

        // Menghitung total harga setelah diskon
        double totalHarga = hargaBarang - diskonRupiah;

        // Menampilkan hasil
        System.out.println("Diskon (Rp.): Rp. " + diskonRupiah);
        System.out.println("Total Harga: Rp. " + totalHarga);

        // Menutup objek Scanner
        scanner.close();
    }
    
}
