package pkg100_days_of_coding;

import java.util.Scanner;

public class day96VokalAndKonsonan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah kata atau kalimat: ");
        String input = scanner.nextLine().toLowerCase();

        int vokal = 0;
        int konsonan = 0;

        for (int i = 0; i < input.length(); i++) {
            char iniChar = input.charAt(i);

            if (iniChar == 'a' || iniChar == 'e' || iniChar == 'i' || iniChar == 'o' || iniChar == 'u') {
                vokal++;
            } else if (Character.isLetter(iniChar)) {
                konsonan++;
            }
        }

        System.out.println("Jumlah huruf vokal: " + vokal);
        System.out.println("Jumlah huruf konsonan: " + konsonan);
    }
    
}
