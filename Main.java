package day43;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input informasi karyawan
        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan = input.nextLine();

        System.out.print("Masukkan jam kerja per minggu: ");
        int jamKerja = input.nextInt();

        // Hitung gaji berdasarkan perbandingan
        double gajiPerJam = 15.0; // Gaji per jam
        int jamNormal = 40; // Jumlah jam kerja normal per minggu

        double gaji;
        if (jamKerja <= jamNormal) {
            gaji = jamKerja * gajiPerJam;
        } else {
            // Jika jam kerja melebihi jam normal, hitung gaji dengan tambahan overtime
            int jamOvertime = jamKerja - jamNormal;
            double gajiNormal = jamNormal * gajiPerJam;
            double gajiOvertime = jamOvertime * (gajiPerJam * 1.5);
            gaji = gajiNormal + gajiOvertime;
        }

        // Output hasil
        System.out.println("\nInformasi Gaji Karyawan:");
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Jam Kerja per Minggu: " + jamKerja);
        System.out.println("Gaji yang Diterima: $" + gaji);

        input.close();
    }
    
}