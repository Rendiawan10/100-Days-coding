package day38minmax;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();

        int[] angka = new int[jumlahAngka];

        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        int min = angka[0];
        int max = angka[0];

        for (int i = 1; i < jumlahAngka; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }

            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("Nilai Minimum: " + min);
        System.out.println("Nilai Maksimum: " + max);

        scanner.close();
    }
    
}
