package minggu3;

import java.util.Scanner;

public class Days029 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan nilai pertama: ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai kedua: ");
        int b = input.nextInt();

        boolean hasil1 = a < b;
        boolean hasil2 = a > b;

        System.out.println("apakah" + a + " < " + b + "?" + hasil1);
        System.out.println("apakah" + a + " > " + b + "?" + hasil2);

    }

}
