package day14perulangan;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Masukkan angka: ");
            int angka = scanner.nextInt();
            
            if (angka % 2 == 0) {
                System.out.println("Genap");
                System.out.println("Silakan masukkan angka lagi.");
                
            } else {
                System.out.println("You and I, end");
                break; // Keluar dari loop jika angka mu ganjil
            }     
    }
        scanner.close();
    }
}
