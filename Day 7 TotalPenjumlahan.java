package day.pkg7.total.penjumlahan;
import java.util.Scanner;
public class Day7TotalPenjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta unutuk pengguna memasukkan batas atas
        int batasAtas = input.nextInt();
        
        // Inisialisasi variabel untuk menyimpan total penjumlahan
        int total = 0;
        
        // Melakukan penjumlahan
        for (int R = 1; R <= batasAtas; R++) {
            total += R;
        }
        
        // Menampilkan hasil penjumlahan
        System.out.println("Total penjumlahan dari 1 hingga " + batasAtas + "adalah: " + total);
        
        // Menutup scanner
        input.close();
    }
    
}
