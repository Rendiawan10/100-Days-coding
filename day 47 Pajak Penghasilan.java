package com.mycompany.days0fcoding;

import java.util.Scanner;

public class day47pajakPenghasilan {
    public static void main(String[] args) {
        Scanner Rendi = new Scanner(System.in);
        
        System.out.print("Masukkan Gaji Anda: Rp.");
        double gaji = Rendi.nextDouble();
        
        System.out.print("Masukkan Jumlah PPN: Rp. ");
        double ppn = Rendi.nextDouble();
        
        double pajak = 0.1 * gaji;
        
        double totalGaji = gaji - pajak - ppn;
        
        System.out.println("Gaji Anda: Rp. " + gaji);
        System.out.println("Pajak 10%: ");
        System.out.println("Pajak (Rp.) " + pajak);
        System.out.println("Total Gaji: Rp. " + totalGaji);
        
        Rendi.close();
    }
    
}
