package minggu4;

import java.util.Scanner;

public class Days052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan angka s: ");
        int s = sc.nextInt();

        int i = 1;
        int total = 0;

        while (i <= s) {
            total += i;
            i++;
        }
        System.out.println("jumlah dari 1 sampai " + s + " adalah " + total);
    }

}
