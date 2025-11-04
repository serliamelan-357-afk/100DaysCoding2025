
package minggu5;

import java.util.Scanner;

public class Days058 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = s.nextInt();
        System.out.println("\nAngka dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            
        }
        System.out.println("\n\nAngla henap dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i %2 == 0) {
                System.out.print(i + " ");
                
            }
            
        }
    }

}

