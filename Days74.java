package minggu6;

import java.util.Scanner;

public class Days074 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n===MENU===");
            System.out.println("1. Halo");
            System.out.println("2. Hitung penjumlahan 2 angka");
            System.out.println("3. Keluar");
            System.out.println("Pilih menu (1-3): ");

            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Halo, selamat datang!");
                    break;
                case 2:
                    System.out.println("Masukan angka pertama: ");
                    int a = s.nextInt();
                    System.out.println("Masukkan angka kedua: ");
                    int b = s.nextInt();
                    System.out.println("Hasil penjumlahan: " + (a + b));
                    break;

                case 3:
                    System.out.println("Selesai. Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak ada, coba lagi");

            }
        } while (pilihan != 3);

    }

}
