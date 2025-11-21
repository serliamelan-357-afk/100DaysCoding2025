package minggu6;

import java.util.Scanner;

public class Days075 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan kalimat: ");
        String kalimat = s.nextLine();
        
        System.out.println("Jumlah karakter : " + kalimat.length());
        System.out.println("Huruf besar     : " + kalimat.toUpperCase());
        System.out.println("Huruf kecil     : " + kalimat.toLowerCase());
