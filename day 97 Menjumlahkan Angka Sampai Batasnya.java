package pkg100_days_of_coding;

import java.util.Scanner;

public class day97MenjumlahkanAngkaSampaiBatasnya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        int batas = in.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= batas; i++) {
            jumlah += i;
            if (i > 1) {
                System.out.print("+");
            }
            System.out.print(i);
            
        }
        System.out.println(" = "+jumlah);
        
    }
    
}
