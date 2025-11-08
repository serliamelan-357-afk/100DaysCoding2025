package minggu5;

import java.util.Scanner;

public class Days062 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        System.out.print("Masukan nilai N: ");
        int N = s.nextInt();
        int jumlah = 0;
        for (int i = 2; i <= N; i++) {
            jumlah += 2;
            
            
        }
        System.out.println("Jumlah dari 2 sampai " + N + " adalah " + jumlah);
        
    }

}
