package day20;

public class Main {
    
    public static void main(String[] args) {
        int radius = 5;

        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i * i + j * j <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // spasi
                }
            }
            System.out.println();
        }
    }
    
}
