package pkg100_days_of_coding;

import java.util.Scanner;

public class day60ArrayDataMahasiswa {
    public static void main(String[] args) {
        String[][] dataMahasiswa = new String[5][3];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            dataMahasiswa[i][0] = nama;
            
            System.out.print("Nim: ");
            String nim = sc.nextLine();
            dataMahasiswa[i][1] = nim;
            
            System.out.print("Nilai: ");
            String nilai = sc.nextLine();
            dataMahasiswa[i][2] = nilai;
        }
        
        System.out.println("Data Mahasiswa Penerima Bidik Misi: ");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + dataMahasiswa[i][0]);
            System.out.println("Nim  : " + dataMahasiswa[i][1]);
            System.out.println("Nilai: " + dataMahasiswa[i][2]);
            System.out.println();
        }
        
        sc.close();
    }
    
}
