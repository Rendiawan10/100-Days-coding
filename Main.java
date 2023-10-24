package day16Totalbelanja;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int belanja = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total belanja: Rp");
        belanja = input.nextInt();
        
        if (belanja > 5000) {
            System.out.println("Selamat, anda mendapatkan diskon yeee!");
        }    
            System.out.println("Terima kasih (:");
            System.out.println("Total belanja: " + belanja);
            
    }
    
}