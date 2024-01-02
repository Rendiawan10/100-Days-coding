package pkg100_days_of_coding;
public class day86Penggunaan_equalsIgnoreCase {
    public static void main(String[] args) {
        String Rendi1 = "Bahagia";
        String Rendi2 = "Bahagia";
        
        if (Rendi1.equalsIgnoreCase(Rendi2)) {
            System.out.println("Kedua string sama (ignoring case).");
        } else {
            System.out.println("Kedua string berbeda.");
        }
    }
    
}
