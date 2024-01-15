package pkg100_days_of_coding;

import java.util.Scanner;

public class day99MengetahauiBilanganBulatPositifDanNegatif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = scanner.nextInt();

        if (bilangan > 0) {
            System.out.println(" positif.");
        } else if (bilangan < 0) {
            System.out.println(" negatif.");
        } else {
            System.out.println(" nol.");
        }

        scanner.close();
    }
    
}
