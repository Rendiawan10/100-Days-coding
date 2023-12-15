package pkg100_days_of_coding;

import java.util.Scanner;

public class day68KonversiMataUang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Uang dalam IDR: ");
        double jumlahIDR = sc.nextDouble();
        
        System.out.println("Masukkan Nilai Tukar USD/IDR: ");
        double nilaiTukar = sc.nextDouble();
        
        double jumlahUSD = konversiIDRtoUSD(jumlahIDR, nilaiTukar);
        
        System.out.println("Jumlah uang dalam USD: " + jumlahUSD);
    }

    private static double konversiIDRtoUSD(double jumlahIDR, double nilaiTukar) {
        return jumlahIDR / nilaiTukar;
    }
    
}
