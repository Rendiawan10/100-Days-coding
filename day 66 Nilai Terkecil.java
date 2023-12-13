package pkg100_days_of_coding;
public class day66NilaiTerkecil {
    public static void main(String[] args) {
         int[] angka = {45, 89, 65, 79, 16, 34, 87, 65};
       
        int nilaiTerkecil = cariNilaiTerkecil(angka);

        System.out.println("Nilai terkecil: " + nilaiTerkecil);
    }

    public static int cariNilaiTerkecil(int[] array) {
        int terkecil = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < terkecil) {
                terkecil = array[i];
            }
        }

        return terkecil;
    }
}
