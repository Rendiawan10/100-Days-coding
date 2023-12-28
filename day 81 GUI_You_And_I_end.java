package pkg100_days_of_coding;

import javax.swing.JOptionPane;

public class day81GUI_You_And_I_end {
    public static void main(String[] args) {
        while(true){
            String angka1 = JOptionPane.showInputDialog("Masukkan Angka : ");
            int angka = Integer.parseInt(angka1);
            if (angka % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Angka Genap");
            }else{
                JOptionPane.showMessageDialog(null, "You and I, end");
                break;
            }
        }
    }
    
}
