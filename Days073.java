package minggu6;

import java.util.Scanner;

public class Days073 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
        int angka; 
        int total = 0;
        
        System.out.println("Program Penjumlahan (berhenti jika inputan negatif)");
        
        while (true) {
            System.out.println("Masukkan angka: ");
            angka = s.nextInt();
            
            if (angka < 0) {
                break;
                
            }
            
            total += angka;
        }
        System.out.println("Total penjumlahan = " + total);
       
        
    }

}
