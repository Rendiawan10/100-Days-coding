package com.mycompany.days0fcoding;

import java.util.Scanner;
public class day50soalbuatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ongkos = 7000;
        System.out.println("Total ongkos ke pasar: " + ongkos);
        
        System.out.print("Masukkan Berat buah jeruk (Kg): ");
        double beratJeruk = sc.nextDouble();
        
        double hargaPerkilo = 15000;
        double totalHargaJeruk = beratJeruk * hargaPerkilo;
        System.out.println("Total harga buah jeruk: Rp. " + totalHargaJeruk);
        
        System.out.println("Terimkasih Telah berbelanja di Toko (Jeruk segar)");
        
        System.out.print("Masukkan Ongkos Pulang: ");
        int ongkosPulang = sc.nextInt();
        
        int ongkos2 = 7000;
        int totalOngkos = ongkosPulang + ongkos2;
        System.out.println("Total Ongkos PP: " + totalOngkos);
        
        sc.close();
    }
    
}
