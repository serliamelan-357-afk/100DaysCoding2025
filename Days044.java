package minggu4;

import java.util.Scanner;

public class Days044 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai siswa :");
        int nilai = input.nextInt();

        String predikat;
        if (nilai >= 90 && nilai <= 100) {
            predikat = "sangat baik (A)";
        } else if (nilai >= 80) {
            predikat = "baik (B)";
        } else if (nilai >= 70) {
            predikat = "cukup (C)";
        } else if (nilai >= 60) {
            predikat = "kurang (D)";
        } else {
            predikat = " gagal (E)";

        }
        System.out.println("nilai siswa: " + nilai);
        System.out.println("predikat: " + predikat);
    }

}
