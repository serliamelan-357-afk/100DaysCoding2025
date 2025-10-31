package minggu4;

import java.util.Scanner;

public class Days054 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan 5 angka: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Masukkan angka ke- " + i + ": ");
            int angka = s.nextInt();
            
            if (angka < 0) {
                System.out.println("Angka negatif dilewati: ");
                continue; 
                
            }
            System.out.println("angka positif: " + angka);
        }
    }

}
