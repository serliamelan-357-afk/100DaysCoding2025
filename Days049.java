package minggu4;

import java.util.Scanner;

public class Days049 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int a = input.nextInt();

        String hasil = (a % 2 == 0) ? "genap" : "ganjil";
        System.out.println("angka" +  a  +  "adalah"  +  hasil);
    }

}
