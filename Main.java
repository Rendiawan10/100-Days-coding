package day17Array;

public class Main {
    
    public static void main(String[] args) {
        // Mendefinisikan sebuah array integer dengan panjang 5
        int[] Nilai = new int[5];

        // Mengisi array dengan nilai
        Nilai[0] = 10;
        Nilai[1] = 20;
        Nilai[2] = 30;
        Nilai[3] = 40;
        Nilai[4] = 50;

        // Mencetak isi array
        for (int i = 0; i < Nilai.length; i++) {
            System.out.println("Element ke-" + i + ": " + Nilai[i]);
        }
    }
}