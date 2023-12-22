package day75;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        
        double jumlahSemester = (double) jumlahMahasiswa / 30;

        System.out.println("Hasil Konversi");
        System.out.println("Jumlah Mahasiswa: " + jumlahMahasiswa);
        System.out.println("Jumlah Semester: " + jumlahSemester);

        scanner.close();
    }
}
