package day34luaslingkaran;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        // Membuat objek scanner untuk inputan data dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta untuk memasukkan jari-jari pada lingkaran
        System.out.print("Masukka jari-jari Lingkaran: ");
        double jariJari = input.nextDouble();
        
        // Menghitung Luas pada lingkaran
        double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
        
        // Menampilkan hasil
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " Adalah " + luasLingkaran);
        
        // Menutup objek scanner
        input.close();
    }
    
}
