package minggu3;

import java.util.Scanner;

public class Days032 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan hasil ujian: ");
        int hasilujian = input.nextInt();
        
        System.out.println("Masukan nilai kehadiran: ");
        int nilaikehadiran = input.nextInt();
        
        boolean Lulus = (hasilujian >= 80) || (nilaikehadiran >= 90);
        
        System.out.println("hasil ujian: " + hasilujian);
        System.out.println("nilai kehadiran: " + nilaikehadiran);
        System.out.println("apakah lulus?: " + Lulus);
    }

}
