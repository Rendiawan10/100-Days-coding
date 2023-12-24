package day77;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        int total = 0;

        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            int nilai = input.nextInt();
            total += nilai;
        }

        double rataRata = (double) total / jumlahData;

        System.out.println("Nilai rata-rata: " + rataRata);
    }
}