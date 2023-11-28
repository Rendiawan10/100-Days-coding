package day51array2;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int R;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Banyak inputan nilai: ");
        R = sc.nextInt();
        
        int[] nilai = new int[R];
        for (int a=0; a < nilai.length; a++) {
            nilai [a] = sc.nextInt();
            
        }
        for (int a=0; a < nilai.length; a++) {
            if (nilai[a] %2==0) {
                System.out.println("Genap");
            }else{
                System.out.println("Ganjil");
                
            }
        }
    }
    
}