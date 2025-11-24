package minggu6;

import java.util.Scanner;

public class Days078 {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        
        System.out.print("Masukkan kata pertama :");
        String kata1 = s.nextLine();
        System.out.print("Masukkan kata kedua :");
        String kata2 = s.nextLine();
        
        System.out.println("\n===PENGECEKAN STRING===");
        System.out.println("equals()             :" + kata1.equals(kata2));
        System.out.println("equalsIgnoresCase()  :" + kata1.equalsIgnoreCase(kata2));
        System.out.println("compareTo()          :" + kata1.compareTo(kata2));
        System.out.println("compareToIgnoreCase():" + kata1.compareToIgnoreCase(kata2));
        
        System.out.println("\nMasukkan kalimat: ");
        String kalimat =s.nextLine();
        
        System.out.println("\n=== OPERASI STRING ===");
        System.out.println("panjajng kaliimat : " + kalimat.length());
        System.out.println("Huruf besar       : " + kalimat.toUpperCase());
        System.out.println("Huruf kecil       : " + kalimat.toLowerCase());
        System.out.println("Huruf petama      : " + kalimat.charAt(0));
        System.out.println("SubString( 0,7)   : " + kalimat.substring(0, 7));
        System.out.println("contains(\"java\"): " + kalimat.contains("java"));
        System.out.println("indexOf(\"java\") : " + kalimat.indexOf("java"));
        
        System.out.println("\n=== SPLIT ===");
        String[] kata = kalimat.split(" ");
        for (int i = 0; i < kata.length; i++) {
            System.out.println("Kata ke-" + (i+1) + " : " + kata[i]);
            
            
            System.out.println("\n=== CONCAT ===");
            System.out.println("Gbungan +      : " + kata1 + " " + kata2);
            System.out.println("Gbungan concat : " + kata1.concat(kata2));
            
        }
                
    }

}
