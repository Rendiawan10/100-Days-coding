package pkg100_days_of_coding;

import java.util.Scanner;

public class day98MenghitungFaktorialDariSebuahBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan untuk menghitung faktorial: ");

        int bilangan = scanner.nextInt();

        long hasilFaktorial = 1;

        for (int i = 1; i <= bilangan; i++) {
            hasilFaktorial *= i;
        }

        System.out.println("Faktorial dari " + bilangan + " adalah: " + hasilFaktorial);

        scanner.close();
    }
    
}
