package pkg100_days_of_coding;

import java.util.Scanner;

public class day94Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frasa: ");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s", "").toLowerCase();

        boolean isPalindrome = true;
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " adalah palindrom.");
        } else {
            System.out.println(input + " bukan palindrom.");
        }

        scanner.close();
    }
    
}
