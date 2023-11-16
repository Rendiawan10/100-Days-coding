package day39switchcase;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan pilihan (1-3):");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih opsi 1");
                break;
            case 2:
                System.out.println("Anda memilih opsi 2");
                break;
            case 3:
                System.out.println("Anda memilih opsi 3");
                break;
            default:
                System.out.println("Anda Mendapat Zonk");
        }

        scanner.close();
        
    }
    
}
