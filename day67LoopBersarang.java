package pkg100_days_of_coding;

import java.util.Scanner;
public class day67LoopBersarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int rendi = scanner.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int columns = scanner.nextInt();

        int total = 0;

        for (int i = 1; i <= rendi; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("Masukkan nilai untuk baris " + i + " dan kolom " + j + ": ");
                int nilai = scanner.nextInt();

                total += nilai;
            }
        }

        System.out.println("Total nilai: " + total);


        scanner.close();
    }
    
}
