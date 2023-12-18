package day_71;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai dalam meter: ");
        double meter = scanner.nextDouble();
        
        double kilometer = meter / 1000;
        
        System.out.println(meter + " meter sama dengan " + kilometer + " kilometer.");
        
        scanner.close();
    }
    
}
