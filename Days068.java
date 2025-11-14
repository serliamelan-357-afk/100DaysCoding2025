package latihan1;

import java.util.Scanner;

public class membuatPersegi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukan ukuran persegi: ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");

            }

            System.out.println();
            
            

        }
    }

}
