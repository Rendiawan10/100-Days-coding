public class day52 {
    public static void main(String[] args) {
        int[] nilaiMahasiswa = {45, 78, 71, 89, 93, 58, 62, 63, 34, 78};
        int standarLulus = 70;

        System.out.println("Nilai mahasiswa yang lulus:");
        for (int nilai : nilaiMahasiswa) {
            if (nilai > standarLulus) {
                System.out.println(nilai);
                
            }
        }
    }
}

    

