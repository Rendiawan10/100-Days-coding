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
        String rendi = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char huruf1 = huruf.charAt(new Random().nextInt(huruf.length()));
        char huruf2 = huruf.charAt(new Random().nextInt(huruf.length()));
       

        int angka1 = new Random().nextInt(10);
        int angka2 = new Random().nextInt(10);
        int angka3 = new Random().nextInt(10);
        int angka4 = new Random().nextInt(10);
        
        char rendi1 = rendi.charAt(new Random().nextInt(rendi.length()));
        char rendi2 = rendi.charAt(new Random().nextInt(rendi.length()));

        String namaPlate = "" + huruf1 + huruf2 + " " + angka1 + angka2 + angka3 + angka4 + " " + rendi1 + rendi2;

        return namaPlate;
        
    
    
    }
    
}
