package day72;

public class Main {
    
    public static void main(String[] args) {
        
        int[] arrayAngka = {1, 2, 3, 4, 5};
        
        int hasilPenjumlahan = jumlahkanArray(arrayAngka);
        
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
    }
    
    public static int jumlahkanArray(int[] array) {
        int jumlah = 0;
        for (int elemen : array) {
            jumlah += elemen;
        }
        return jumlah;
    }
    
}
