package day.pkg5.gaji.karyawan;
import java.util.Scanner;
public class Day5GajiKaryawan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Memasukkan gaji pokok melalui input
        System.out.print("Masukkan gaji pokok bulanan: Rp. ");
        double gajipokok = input.nextDouble();
        
        // Memasukkan lama lembur melalui input
        System.out.print("Masukkan lama lembur (jam): ");
        double lamaLembur = input.nextDouble();
        
        // Memasukkan gaji lembur
        double gajiLembur = lamaLembur * 55000;
        
        // Menghitung gaji bersih
        double gajibersih = gajipokok + gajiLembur;
        
        // Menampilkan gaji bersih
        System.out.print("Gaji bersih Karyawan: Rp. " + gajibersih);
        
        // Menutup scanner
        input.close();
    }
    
}
