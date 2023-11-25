package com.mycompany.days0fcoding;

import java.util.Scanner;

public class day48BeratBadan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Berat Badan Anda (Kg): ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Masukkan Tinggi Badan Anda (m): ");
        double tinggiBadan = input.nextDouble();
        
        double bmi = beratBadan / (tinggiBadan * tinggiBadan);
        
        System.out.println("Indeks Massa Tubuh (BMI): " + bmi);
        
        if (bmi < 18.5) {
            System.out.println("Berat Badan Kurang");
        }else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Berat Badan Normal");
        }else if (bmi <= 25 && bmi < 30) {
            System.out.println("Berat Badan Berlebih(Kelebihan Berat Badan)");
        }else{
            System.out.println("Anda Obesitas cok diet diet");
            
        }
        System.out.println("Jangan Lupa Berolahraga");
        
         input.close();
    }
}
        
 
