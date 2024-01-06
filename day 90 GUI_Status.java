package pkg100_days_of_coding;

import javax.swing.JOptionPane;

public class day90GUI_Status {
    public static void main(String[] args) {
        String status = JOptionPane.showInputDialog("Masukkaan Status Menikah (Ya/Tidak): ");
        
        if(status.equalsIgnoreCase("ya")){
            JOptionPane.showMessageDialog(null,"Menikah");
        }else{
            JOptionPane.showMessageDialog(null,"Belum Menikah");
        }
    }
    
}
