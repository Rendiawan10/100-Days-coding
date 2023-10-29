package day21polaRendi;

public class Main {
    
    public static void main(String[] args) {
        
        int tinggi = 5;
        for (int i = tinggi; i >= 1; i--) {
            for (int j = tinggi; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
        
        System.out.println();
        }
    }
}
