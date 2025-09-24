package minggu2;
import java.util.Scanner;
public class Days021 {
    public static void main(String[] args) {
           Scanner input = new Scanner (System.in);
           
           System.out.print("Masukan angka: ");
           int angka7 = input.nextInt();
           
                      
           System.out.print("Masukan angka: ");
           int angka4 = input.nextInt();
           
           int hasilbagi = angka7 / angka4;
           int sisabagi = angka7 % angka4;
           
           
           System.out.println("hasil bagi: " +hasilbagi);
           System.out.println("hasil modulus: " +sisabagi);
           
           
           
    }
    
}
