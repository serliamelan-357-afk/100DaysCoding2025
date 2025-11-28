package minggu6;

import java.util.Scanner;

public class Days082 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] angka = new int[5];
        System.out.println("==MENGISI ARRAY==");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Masukkan angka ke-" + (1+i));
            angka[i] = s.nextInt();
            
        }
        
        System.out.println("\n==MENAMPILKAN ARRAY==");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen indek " + i + " : " + angka[i]);
            
        }
    }

}
