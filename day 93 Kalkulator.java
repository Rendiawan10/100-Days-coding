package pkg100_days_of_coding;

import java.util.Scanner;

public class day93Kalkulator {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Masukkan angka pertama:");
        angka1 = input.nextDouble();

        System.out.println("Pilih operator (+, -, *, /):");
        operator = input.next().charAt(0);

        System.out.println("Masukkan angka kedua:");
        angka2 = input.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil: " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian oleh nol tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
        }

        input.close();
    }
    
}
