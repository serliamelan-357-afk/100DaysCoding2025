package minggu3;

import java.util.Scanner;

public class Days037 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println("angka" + angka + "adalah genap");
        } else {
            System.out.println("angka" + angka + "adalah ganjil");

        }

    }
