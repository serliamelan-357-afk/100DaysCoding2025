package Latihan10;

import java.util.Scanner;

public class latihan01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan total belanjaan: Rp ");
        double totalBelanja = input.nextDouble();

        double diskon = 0;
        double totalBayar;

        if (totalBelanja > 100000) {
            diskon = totalBelanja * 0.10;
            System.out.println("Selamat! anda mendapatkan diskon 10%");

        }
        totalBayar = totalBelanja - diskon;

        System.out.println("Jumlah diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

    }

}
