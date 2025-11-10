package minggu5;

import java.util.Scanner;

public class Days064 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Masukan nilai N: ");
        int N = s.nextInt();
        
        int jumlah = 0;
        for (int i = 1; i <= N; i++) {
            jumlah += i;
            
        }
        System.out.println("Jumlah dari 1 sampai " + N + " dalah: " + jumlah);
    }

}
