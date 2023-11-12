package day35array2;

public class Main {
    
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        if (perbandinganArray(array1, array2)) {
            System.out.println("Kedua array sama.");
        } else {
            System.out.println("Kedua array berbeda.");
        }
    }

    public static boolean perbandinganArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    
}
