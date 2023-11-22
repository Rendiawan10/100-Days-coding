package com.mycompany.days0fcoding;

import java.util.Scanner;

public class day45PolaSegitiga {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int tinggi = scanner.nextInt();
        
        int baris = 1;
        
        while (baris <= tinggi) {
            int kolom = 1;
            
            while(kolom <= baris) {
                System.out.print("* ");
                kolom++;
            }
            
            System.out.println();
            baris++;
        }
        
        scanner.close();
    }
    
}
