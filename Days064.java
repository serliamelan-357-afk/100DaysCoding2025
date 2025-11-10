package minggu5;

import java.util.Scanner;

public class Days064 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
        System.out.print("Masukkan nilai M: ");
        int M = s.nextInt();
        System.out.print("Masukkan nilai N: ");
        int N = s.nextInt();
        
        int hasil =1;
        for (int i = 1; i <= N; i++) {
            hasil *= M;
            
        }
        System.out.println(M + " pangkat " + N + " = " + hasil);
            
        
    }


}
