package minggu6;

import java.util.Scanner;

public class Days070 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan p: ");
        int p = s.nextInt();
        System.out.print("MasukkanL: ");
        int L = s.nextInt();
        
        for (int i = 1; i <= L; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }

}
