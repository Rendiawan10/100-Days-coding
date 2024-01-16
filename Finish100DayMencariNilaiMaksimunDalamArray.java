package pkg100_days_of_coding;
public class Finish100DayMencariNilaiMaksimunDalamArray {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15};

        int maksimum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maksimum) {
                maksimum = array[i];
            }
        }

        System.out.println("Nilai Maksimum: " + maksimum);
    }
    
}
