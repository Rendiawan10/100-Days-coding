package day18Perulangan;
public class Main {
    public static void main(String[] args) {
        int tinggi = 10; // Nilai bisa di ganti sesuai keinginan dong ;)
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
    }
            System.out.println();
        }
    }
}