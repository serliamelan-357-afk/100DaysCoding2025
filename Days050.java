package minggu4;

import java.util.Scanner;

public class Days050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();
        
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);
    }

}
