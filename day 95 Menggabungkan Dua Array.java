package pkg100_days_of_coding;
public class day95MenggabungkanDuaArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};

        int[] array2 = {6, 7, 8, 9, 10};

        System.out.print("Array pertama: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.print("\nArray kedua: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        int panjangArray1 = array1.length;
        int panjangArray2 = array2.length;
        int panjangHasil = panjangArray1 + panjangArray2;
        int[] hasil = new int[panjangHasil];

        for (int i = 0; i < panjangArray1; i++) {
            hasil[i] = array1[i];
        }

        for (int i = 0; i < panjangArray2; i++) {
            hasil[panjangArray1 + i] = array2[i];
        }

        System.out.println("\nArray setelah digabungkan: ");
        for (int i = 0; i < panjangHasil; i++) {
            System.out.print(hasil[i] + " ");
        }
    }
    
}
