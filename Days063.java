package minggu5;

import java.util.Scanner;

public class Days063 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan nilai S: ");
        int S = s.nextInt();
        
        int hasil = 1;
        for (int i = 1; i <= S; i++) {
            hasil = hasil * i;
            
        }
        System.out.println("hasil dari perkalian 1-" + S + " adalah " + hasil + "\n");
    }

}
