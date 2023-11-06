package day29;

public class Main {
    
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean kondisi1 = (x > 3) && (y < 15);
        boolean kondisi2 = (x > 3) || (y < 15);
        boolean kondisi3 = !(x == y);
        
        System.out.println("Hasil, Kondisi1 =" + kondisi1);
        System.out.println("Hasil, Kondisi2 =" + kondisi2);
        System.out.println("Hasil, Kondisi3 =" + kondisi3);
    }
    
}