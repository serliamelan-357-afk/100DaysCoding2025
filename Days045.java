package minggu4;

import java.util.Scanner;

public class Days045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan angka bulan 1 - 3: ");
        int bulan = sc.nextInt();
        
        switch (bulan){
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3: 
                System.out.println("Maret");
                break;
            default:
                System.out.println("Bulan Tidak valid");
                break;
        }
        
        
    }

}
