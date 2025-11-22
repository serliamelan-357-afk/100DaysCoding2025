package minggu6;

import java.util.Scanner;

public class Days076 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan kata pertama: ");
        String kata1 = s.nextLine();
        System.out.println("Masukkan kata kedua: ");
        String kata2 = s.nextLine();
        
        System.out.println("\n=== PENGECEKAN STRING ===");
        System.out.println("1. equals () : " + kata1.equals(kata2));
        System.out.println("2. equalsIgnoreCase() : " + kata1.equalsIgnoreCase(kata2));
        System.out.println("3. contains() : " + kata1.contains(kata2));
        System.out.println("4. kata1 isEmpty() : " + kata1.isEmpty());
        System.out.println("5. kata2 isEmpty() : " + kata2.isEmpty());
        
}
    
}
