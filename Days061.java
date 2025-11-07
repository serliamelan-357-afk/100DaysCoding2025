package minggu5;

import java.util.Scanner;

public class Days061 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
        System.out.print("Masukan nilai M: ");
        int M = s.nextInt();
        System.out.print("Masukan nilai N: ");
        int N = s.nextInt();
        
        System.out.println("\nAngka kelipatan " + M + " dari 1 sampai " + N);
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + " ");
                
            }
            
        }
    }

}
