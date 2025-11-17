package minggu6;

import java.util.Scanner;

public class Days071 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = s.nextInt();
        
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }

}
