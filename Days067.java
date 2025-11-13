package minggu5;

import java.util.Scanner;

public class Days067 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  
        
        System.out.println("Masukkan nilai N: ");
        int N = s.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.print("*");
            
        }
        System.out.println();
    }

}
