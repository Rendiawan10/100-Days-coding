package pkg100_days_of_coding;
public class day59 {
    public static void main(String[] args) {
        int[][] nilai = {
            {24},{31},
            {68},{55},
            {83},{77},
            {99},{45},
            {23},{67},
        };
        
        int total = 0;
        
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i][0];
            
        }
        System.out.println("Total Nilai Adalah: " + total);       
        }
    }