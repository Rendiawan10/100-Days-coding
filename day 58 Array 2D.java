package pkg100_days_of_coding;
import java.util.Scanner;
public class day58Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Baris: ");
        int baris = sc.nextByte();
        System.out.print("Masukan Jumlah Kolom: ");
        int kolom = sc.nextInt();
        
        int[][] array2D = new int[baris][kolom];
        
        System.out.println("Nilai Array: ");
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(" Baris " + i + " Kolom " + j + ": ");
                array2D[i][j] = sc.nextInt();               
            }
            
        }
        System.out.println("Hasil");
        
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(array2D[i][j] + " ");
                
            }
            System.out.println();
            
        }
        
        sc.close();
    }
}
