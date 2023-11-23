package com.mycompany.days0fcoding;

import java.util.Scanner;

public class day46NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner Rendi = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlahMahasiswa = Rendi.nextInt();
        
        int i = 0;
        while(i < jumlahMahasiswa ) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            int nilai = Rendi.nextInt();
            
            if (nilai >= 80) {
                System.out.println("Mahasiswa Lulus Dengan Nilai A");
            }else if (nilai >=70) {
                System.out.println("Mahasiswa Lulus Dengan Nilai B");
            }else if (nilai >=60) {
                System.out.println("Mahasiswa Lulus Dengan Nilai C");
            }else{
                System.out.println("Mahasiswa Tidak Lulus");
            }
            i++;    
        }
        Rendi.close();
    }
}
    
