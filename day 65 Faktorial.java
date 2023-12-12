package day65;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int angka = scanner.nextInt();

        long faktorial = hitungFaktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: " + faktorial);
        
    }
    
    
    private static long hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
        
    
