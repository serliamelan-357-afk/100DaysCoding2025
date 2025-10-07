package minggu3;

import java.util.Scanner;

public class Days030 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Msukan angka pertama: ");
        int a = input.nextInt();
        
        System.out.println("Masukan angka kedua: ");
        int b = input.nextInt();
        
        
        System.out.println("Apakah" + a + ">=" + b + "?" + (a >= b));
        System.out.println("Apakah" + a + "<=" + b + "?" + (a <= b));
        
    }
    
}
