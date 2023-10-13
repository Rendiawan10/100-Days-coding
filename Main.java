package day 5 gaji karyawan ;

import java.util.Scanner;
public class HitungGajiKaryawan {
    
    public static void main(String[] args) {
        
        import java.util.Scanner;

        Scanner input = new Scanner(System.in);

        // Memasukkan gaji pokok melalui input
        System.out.print("Masukkan gaji pokok bulanan: Rp. ");
        double gajiPokok = input.nextDouble();

        // Memasukkan lama lembur melalui input
        System.out.print("Masukkan lama lembur (jam): ");
        double lamaLembur = input.nextDouble();

        // Menghitung gaji lembur
        double gajiLembur = lamaLembur * 55000;

        // Menghitung gaji bersih
        double gajiBersih = gajiPokok + gajiLembur;

        // Menampilkan gaji bersih
        System.out.println("Gaji Bersih Karyawan: Rp. " + gajiBersih);

        // Menutup scanner
        input.close();
    }
}
