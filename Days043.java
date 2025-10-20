package minggu4;

import java.util.Scanner;

public class Days043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan batas angka: ");
        int batas = sc.nextInt();
        
        System.out.println("\nBilangan kelipatan 3, 5, dan 3 % 5 dari 1 sampai " + batas + ":");
        
        for ( int s = 1; s <= batas; s++){
            if (s % 3 == 0 && s % 5 == 0){
                System.out.println(s + "adalah kelipatan 3 dan 5");
            }else if (s % 3 == 0){
                System.out.println(s + "adalah kelipatan 3");
            }else if (s % 5 == 0){
                System.out.println(s + "adalah kelipatan 5");
            }
        }
    }

}
