package day63ternary;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nilai: ");
        double nilai = input.nextDouble();
        
        String hasil = (nilai > 40) ? "lulus" : "gagal";
        
        System.out.println(" kamu " + hasil + " ujian.");
        
        
        input.close();
    }
}