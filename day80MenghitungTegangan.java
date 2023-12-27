package pkg100_days_of_coding;

import java.util.Scanner;

public class day80MenghitungTegangan {
    public static void main(String[] args) {
        double tegangan, arus, resistansi;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai arus (Dalam Ampere):");
        arus = sc.nextDouble();
        
        System.out.print("Masukkan Nilai Resistani (Dalam Ohm):");
        resistansi = sc.nextDouble();
        
        tegangan = arus * resistansi;
        
        System.out.println("Tegangan Dalam Rangkaian Adalah: " + tegangan + " Volt ");;
        
       sc.close();
    }
    
}
