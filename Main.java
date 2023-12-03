package day56;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int angkaRahasia = 42;
        int nilai;

        do {
            System.out.print("Masukkan nilai tebakan: ");
            nilai = scanner.nextInt();

            if (nilai < angkaRahasia) {
                System.out.println("Nilai Terlalu Kecil");
            } else if (nilai > angkaRahasia) {
                System.out.println("Nilai Terlalu Besar");
            } else {
                System.out.println("Nilai sama dengan angka rahasia");
            }

        } while (nilai != angkaRahasia);

        System.out.println("Selamat! Anda berhasil menebak angka rahasia.");
        scanner.close();
    }
}