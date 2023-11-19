package day42nilai;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai
        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();

        // Menentukan apakah lulus atau gagal
        if (nilai >= 60) {
            System.out.println("LULUS");
        } else {
            System.out.println("GAGAL");
        }

        // Menutup objek Scanner
        scanner.close();
    }
    
}
