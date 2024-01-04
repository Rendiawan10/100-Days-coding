package pkg100_days_of_coding;

import java.time.LocalDate;

public class day88MenghitungJarakHari {
    public static void main(String[] args) {
        LocalDate tanggalAwal = LocalDate.of(2024, 1, 1);
        LocalDate tanggalAkhir = LocalDate.of(2024, 1, 4);

        long selisihHari = tanggalAkhir.toEpochDay() - tanggalAwal.toEpochDay();

        System.out.println("Jarak hari antara tanggal " + tanggalAwal + " dan " + tanggalAkhir + " adalah " + selisihHari + " hari");
    }
    
}
