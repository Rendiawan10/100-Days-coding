package day73;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai resistansi (ohm): ");
        double resistansi = scanner.nextDouble();

        System.out.print("Masukkan nilai arus (ampere): ");
        double arus = scanner.nextDouble();
        
        double hambatan = resistansi * arus;
        
        System.out.println("Hambatan total adalah: " + hambatan + " ohm");
        
        scanner.close();
    }
    
}
