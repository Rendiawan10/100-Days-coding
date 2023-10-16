package day.pkg8.operator;
public class Day8Operator {
    public static void main(String[] args) {
        
        // Operator penjumlahan
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("Penjumlahan: " + sum);
        
        // Operator pengurangan
        int Rendi1 = a - b;
        System.out.println("Pengurangan: " + Rendi1);
        
        // Operator perkalian
        int Rendi2 = a * b;
        System.out.println("Perkalian: " + Rendi2);
        
        // Operator pembagian
        int Rendi3 = a / b;
        System.out.println("Pembagian: " + Rendi3);
        
        // Operator sisa bagi
        int Rendi4 = a % b;
        System.out.println("Sisa bagi: " + Rendi4);
        
        // Operator penugasan
        int Rendi5 = 10;
        Rendi5 += 5; // Sama dengan Rendi5 = x + 5
        System.out.println("Penugasan: " + Rendi5);
        
        // Operator perbandingan
        boolean Rendi6 = (a == b);
        System.out.println("Perbandingan (==): " + Rendi6);
        boolean Rendi7 = (a != b);
        System.out.println("Perbandingan (!=): " + Rendi7 );
        
        boolean Rendi8 = (a > b);
        System.out.println("Perbandingan (>):" + Rendi8);
        
        boolean Rendi9 = (a < b);
        System.out.println("Perbandingan (<): "+ Rendi9);
        
        // Operator logika
        boolean true1 = true;
        boolean false2 = false;
        
        boolean Rendi10 = true1 && false2;
        System.out.println("Logika (&&) " + Rendi10);
        
        boolean Rendi11 = true1 || false2;
        System.out.println("Logika (||): " + Rendi11);
        
        boolean Rendi12 = !true1;
        System.out.println("Logika (!): " + Rendi12);
                
        
    }
    
}
