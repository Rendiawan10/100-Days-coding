package com.mycompany.days0fcoding;
import java.util.Scanner;
public class day49HasilPenjualan {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int jumlahProduk;
        double totalPenjualan = 0;
        
        System.out.print("Masukkan jumlah produk yang akan dijual: ");
        jumlahProduk = input.nextInt();

        for (int i = 1; i <= jumlahProduk; i++) {
            System.out.println("\nData Produk ke-" + i);
            System.out.print("Masukkan harga produk: ");
            double hargaProduk = input.nextDouble();

            System.out.print("Masukkan jumlah produk yang terjual: ");
            int jumlahTerjual = input.nextInt();

            double totalProduk = hargaProduk * jumlahTerjual;

            totalPenjualan += totalProduk;
        }

        System.out.println("\nTotal Penjualan: $" + totalPenjualan);

        input.close();
    }
}
