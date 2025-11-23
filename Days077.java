package minggu6;

import java.util.Scanner;

public class Days077 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan kalimat: ");
        String kalimat = s.nextLine();
        
        System.out.println("\n===MANIPULASI SSTRING===");
        
        System.out.println("substing(0, 5) : " + kalimat.substring(0, 5));
        System.out.println("replace('a', 'i') : " + kalimat.replace('a', 'i'));
        System.out.println("trim() : [" + kalimat.trim() + "]");
    }

}
