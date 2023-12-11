
package pkg100_days_of_coding;
public class day64OperatorAsignment {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        int hasilPenjumlahan = a + b;
        System.out.println("Hasil Penjumlahan " + hasilPenjumlahan);
        
        a += 3;
        b -= 5;
        
        System.out.println("Nilai a Setelah Di Tambah 3: " + a);
        System.out.println("Nilai b Setelah Di Kurangi 5: " + b);
        
        int c = 8;
        c <<= 2;
        
        System.out.println("Nilai c Setelah Di geser 2 bit: " + c);
    }
    
}
