package minggu5;

import java.util.Scanner;

public class Days56 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i = 1, n, jumlah = 0;
        
        System.out.println("Masukan nilai n: ");
        n = s.nextInt();
        
       do {
           jumlah += i;
           i++;
           
       }while (i <= n);
        System.out.println("Jumlah dari 1 sampai " + n + " adalah " + jumlah);
    }

}
