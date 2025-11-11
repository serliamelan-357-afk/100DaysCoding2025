package minggu5;

import java.util.Scanner;

public class Days065 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N, hasil = 1;
        System.out.print("Masukkan bilangan: ");
        N = s.nextInt();

        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;
        }
        System.out.println("Faktorial dari " + N + " adalah: " + hasil);

    }

}
