
import java.util.Scanner;

public class day52array4 {
    public static void main(String[] args) {
        String[][] meja = new String[2][3];
        Scanner sc = new Scanner(System.in);
        
        for (int bar = 0; bar < meja.length; bar++) {
            for (int kol = 0; kol < meja[bar].length; kol++) {
                System.out.format("Siapa yang akan duduk di meja ke-(%d,%d):", bar,kol);
                meja[bar][kol] = sc.nextLine();
            }
            
        }
        System.out.println("=====================================");
        for (int bar = 0; bar < meja.length; bar++) {
            for (int kol = 0; kol < meja[bar].length; kol++) {
                System.out.format("| %s | \t", meja[bar][kol]);
                
            }
            System.out.println("");
            
        }
        System.out.println("======================================");
    }
    
}
