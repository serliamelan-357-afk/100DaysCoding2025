package minggu7;

import java.util.Scanner;

public class Days087 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int[] data = {5, 9, 3, 7, 1, 8};
        
        System.out.print("Masukkan angka yang ingin di cari: ");
        int cari = s.nextInt();
        
        boolean ditemukan = false;
        
        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                break;
                
            }
            
        }
        if (ditemukan) {
            System.out.println("Angka ditemukan");
            
        }else{
            System.out.println("angka tidak ditemukan");
        }
    }

}
