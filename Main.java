package day15perbandingan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int number= scanner.nextInt();
        
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Master class");
        } else if (number % 3 == 0) {
            System.out.println("pride of 3");
        } else if (number % 5 == 0) {
            System.out.println("pride of 5");
        } else {
            System.out.println("bodo inie tidak masuk dalam ketentuan angkamu");
        }     
    }
}