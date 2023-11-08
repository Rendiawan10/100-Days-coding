package day31soalan2;

public class Main {
    
    public static void main(String[] args) {
        int totalKaloridikonsumsi = 700; // Masukkan kalori yang di konsumsi karunia
        
        String jenisolahraga;
        int waktuolahraga;
        
        if (totalKaloridikonsumsi > 670) {
            jenisolahraga = "Lari";
            waktuolahraga = totalKaloridikonsumsi / 10;
            
        } else if (totalKaloridikonsumsi > 500) {
            jenisolahraga = "Tenis";
            waktuolahraga = totalKaloridikonsumsi / 10;
        } else {
            jenisolahraga = "Berenang";
            waktuolahraga = totalKaloridikonsumsi / 10;
        }
        System.out.println("Karunia Berolahraga");
        System.out.println("Jenis Olahraga : " + jenisolahraga);
        System.out.println("Waktu Olahraga (Menit) : " + waktuolahraga);
    }
    
}
