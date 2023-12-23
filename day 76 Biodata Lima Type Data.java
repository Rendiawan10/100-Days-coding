package pkg100_days_of_coding;

import java.util.Scanner;

public class day76BiodataLimaTypeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan Umur : ");
        int umur = sc.nextInt();
        
        System.out.print("Masukkan Tinggi(cm) : ");
        double tinggi = sc.nextDouble();
        
        System.out.print("Masukkan jenis kelamin (L/P) : ");
        char jenisKelamin =  sc.next().charAt(0);
        
        System.out.print("Apakah Anda Menikah ? (true/false) : ");
        boolean menikah = sc.nextBoolean();
        
        System.out.println("=========================================");
        
        System.out.println("\nBiodata");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Status Menikah : " + (menikah ? "Sudah menikah" : "Belum Menikah"));
        
        sc.close();
    }
    
}
