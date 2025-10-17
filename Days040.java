package minggu3;

import java.util.Scanner;

public class Days040 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan angka pertama: ");
        int a = sc.nextInt();
        System.out.println("Masukan angka kedua: ");
        int b = sc.nextInt();

        System.out.println("pilih operasi (+,-,*,/);");
        char operasi = sc.next().charAt(0);

        if (operasi == '+') {
            System.out.println("Hasil = " + (a + b));
        }
        if (operasi == '-') {
            System.out.println("Hasil = " + (a - b));
        }
        if (operasi == '*') {
            System.out.println("Hasil = " + (a * b));
        }
        if (operasi == '/') {
            System.out.println("Hasil = " + (a / b));
        }

    }

}
