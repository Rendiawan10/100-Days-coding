package day.pkg2.coding;
import java.util.Scanner;
public class Day2Coding {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari keyboard 
        Scanner input = new Scanner(System.in);
        
        // Meminta Pengguna Untuk Memasukkan biodata
        System.out.println("Masukkan Nama Anda");
        String nama = input.nextLine();
        
        System.out.println("Masukkan Alamat Anda: ");
        String alamat = input.nextLine();
        
        System.out.println("Masukkan Umur Anda");
        int umur = input.nextInt();
        
       
        
        System.out.println("----------------------------------");
        
        // Menampilkan biodata yang telah dimasukkan
        System.out.println("Biodata Anda");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + "tahun");
        System.out.println("Alamat: " + alamat);
        
       
        // Menutup objek Scanner
        input.close();
    }
    
}
