package minggu5;

import java.util.Scanner;

public class Days059 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukan nilai N: ");
        int n = s.nextInt();
        
        System.out.println("\nAngka Ganjil dari 1 " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i %2 != 0) {
                System.out.print(i + " ");
                
            }
            
        }System.out.println("\n Angka Genap dari 1 " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i %2 == 0) {
                System.out.print(i + " ");
                
            }
            
        }
    }

}
