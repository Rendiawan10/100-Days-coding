package pkg100_days_of_coding;

import javax.swing.JOptionPane;

public class day85GUI_Biodata {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Masukkan Nama : ");
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat : ");
        String prodi = JOptionPane.showInputDialog("Masukkan Prodi : ");
        String kelas = JOptionPane.showInputDialog("Masukkan Kelas : ");
        String umur = JOptionPane.showInputDialog("Masukkan Umur : ");
        
        JOptionPane.showMessageDialog(null, "Nama : "+nama+"\nAlamat : "+alamat+"\nProdi : "+prodi+"\nKelas : "+kelas+"\nUmur : "+umur);
        
    }
    
}
