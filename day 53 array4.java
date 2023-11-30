package day53array;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        
        double[] nilaiMahasiswa = new double[jumlahMahasiswa];
            
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa " + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextDouble();
        }
        
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + nilaiMahasiswa[i]);
        }

        scanner.close();
    }
    
}
