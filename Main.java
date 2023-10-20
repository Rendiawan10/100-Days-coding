package day12MinMax;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari console
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan a: ");
        // Membaca nilai a dari pengguna
        double a = input.nextDouble();
        
        System.out.print("Masukkan bilangan b: ");
        // Membaca nilai b dari pengguna
        double b = input.nextDouble();
        
        double min = Math.min(a,b);
        double max = Math.max(a,b);
        
        // Menampilkan hasil
        System.out.println("Nilai Min: " + min);
        System.out.println("Nilai Max: " + max);
        
        // Menutup objek Scanner
        input.close();
    }
    
}