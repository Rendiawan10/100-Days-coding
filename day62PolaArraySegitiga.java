package pkg100_days_of_coding;

import java.util.Scanner;

public class day62PolaArraySegitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Segitiga: ");
        int tinggi = sc.nextInt();
        
        int[][] segitiga = new int[tinggi][tinggi];
        
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                segitiga[i][j] = 0;
                
            }
            
        }
        
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(segitiga[i][j] + " ");
                
            }
            System.out.println();
        }
    }
    
}
