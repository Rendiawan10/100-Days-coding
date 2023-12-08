package pkg100_days_of_coding;

import java.util.Scanner;

public class day61MenghitungLuasSegitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang Alas Segitiga: ");
        double alas = sc.nextDouble();
        
        System.out.print("Masukkan Tinggi Segitiga: ");
        double tinggi = sc.nextDouble();
        
        double luas = 0.5 * alas * tinggi;
        
        System.out.println("Jadi Luas Segitiga Adalah = " + luas);
        
        sc.close();
    }
    
}
