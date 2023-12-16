package day69;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tahun lahir Anda: ");
        int tahunLahir = scanner.nextInt();
        
        LocalDate tanggalSekarang = LocalDate.now();
        
        Period umur = Period.between(LocalDate.of(tahunLahir, 1, 1), tanggalSekarang);

        System.out.println("Umur Anda adalah " + umur.getYears() + " tahun, " + umur.getMonths() + " bulan, dan " + umur.getDays() + " hari.");
    }
}