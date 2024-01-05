package pkg100_days_of_coding;

import javax.swing.JOptionPane;

public class day89MenghitungLamaTabungan {
    public static void main(String[] args) {
        double komputer = 55000000;
        double tabungan = 1500000;
        double hasil = komputer / tabungan;
        int total = (int) Math.round(hasil);
        JOptionPane.showMessageDialog(null, total+" Bulan");
    }
    
}
