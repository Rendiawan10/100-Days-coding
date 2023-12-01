package day54;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Konversi Kilogram ke Pon");

        for (int kg = 1; kg <= 100; kg++) {
            double pon = kg * 2.20462;
            System.out.println(kg + " kg = " + pon + " pon");
        }
    }
    
}