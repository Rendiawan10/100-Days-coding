package pkg100_days_of_coding;

import java.util.Random;

public class day92PlatNomor {    
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            String namaPlate = menghasilkanNamaPlate();
            System.out.println("Plat Nomor ke " + (i + 1) + " : " + namaPlate);
        }
    }

    private static String menghasilkanNamaPlate() {
        String huruf = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char huruf1 = huruf.charAt(new Random().nextInt(huruf.length()));
        char huruf2 = huruf.charAt(new Random().nextInt(huruf.length()));

        int angka1 = new Random().nextInt(10);
        int angka2 = new Random().nextInt(10);
        int angka3 = new Random().nextInt(10);
        int angka4 = new Random().nextInt(10);
        
        char huruf3 = huruf.charAt(new Random().nextInt(huruf.length()));
        char huruf4 = huruf.charAt(new Random().nextInt(huruf.length()));

        String namaPlate = "" + huruf1 + huruf2 + " " + angka1 + angka2 + angka3 + angka4 + " " + huruf3 + huruf4;

        return namaPlate;
        
    
    
    }
    
}
