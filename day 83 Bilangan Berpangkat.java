package pkg100_days_of_coding;

import java.util.Scanner;

public class day83BilanganBerpangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Angka: ");
        double angka = sc.nextDouble();
        
        System.out.print("Masukkan Pangkat: ");
        int pangkat = sc.nextInt();
        
        double hasil = Math.pow(angka, pangkat);
        
        System.out.println(angka + "^" + pangkat + "=" + hasil);
    }
    
}
