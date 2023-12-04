package pkg100_days_of_coding;
public class day_57_Total_Nilai {
    public static void main(String[] args) {
        int[] nilaiMahasiwa = {70,90,86,95,78};
        
        int totalNilai = 0;
        for (int nilai : nilaiMahasiwa) {
            totalNilai += nilai;
            
        }
        System.out.println("Total Nilai Mahsiswa: " + totalNilai);
    }
    
}
