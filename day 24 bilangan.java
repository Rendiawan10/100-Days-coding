package day24;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner (System.in);
        System.out.print("Bilangan N: ");
        n = input.nextInt();
        if (n<=9){
            System.out.println(n+"= Bilangan satuan");
        }else if (n<=99){
            System.out.println(n+"= Bilangan puluhan ");
        }else if (n<=999){
            System.out.println(n+"= Bilangan ratusan");
        }else if (n<=9999){
             System.out.println(n+"= Bilangan ribuan");
        }else if (n<=99999){
             System.out.println(n+"= Bilangan puluhan ribuan");
        }
    }
    
}
