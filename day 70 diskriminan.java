package day_70;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan koefisien a: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan koefisien b: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan koefisien c: ");
        double c = scanner.nextDouble();
        
        double diskriminan = b * b - 4 * a * c;

        System.out.println("Diskriminan: " + diskriminan);

        scanner.close();
    }
}
