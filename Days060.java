package minggu5;

import java.util.Scanner;

public class Days060 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukan nilai N: ");
        int N = s.nextInt();
        System.out.println("\nAngka ganjil 1 sampai " + (N - 1) + ":");
        for (int i = 1; i < N; i++) {
            if (i % 2 != 2) {
                System.out.print(i + " ");

            }

                }
        System.out.println("\nAngka genap 1 sampai " + (N - 1) + " " );
        for (int i = 1; i < N; i++) {
            if (i %2 == 0) {
                System.out.print(i + " ");
                
            }
            
        }
          
    }


}
