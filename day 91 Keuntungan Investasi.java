package pkg100_days_of_coding;

import java.util.Scanner;

public class day91KeuntunganInvestasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah investasi awal (IDR): ");
        double investasiAwal = scanner.nextDouble();

        System.out.print("Masukkan tingkat bunga tahunan (%): ");
        double tingkatBunga = scanner.nextDouble();

        System.out.print("Masukkan periode investasi (tahun): ");
        int periodeInvestasi = scanner.nextInt();

        double faktorPertumbuhan = 1 + (tingkatBunga / 100);
        double keuntunganInvestasi = investasiAwal * Math.pow(faktorPertumbuhan, periodeInvestasi);

        System.out.println("Keuntungan investasi setelah " + periodeInvestasi + " tahun: IDR " + keuntunganInvestasi);

        scanner.close();
    }
    
}
