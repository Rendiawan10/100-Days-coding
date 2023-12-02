package day55;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah inputan: ");
        int jumlahInputan = scanner.nextInt();

        for (int i = 0; i < jumlahInputan; i++) {
            System.out.print("Input nilai ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();

            if (nilai % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }
        }

        scanner.close();
    }
    
}
