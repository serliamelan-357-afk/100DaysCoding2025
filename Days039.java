package minggu3;

import java.util.Scanner;

public class Days039 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pilihan = 2;
        
        System.out.println("==Menu Makanan==");
        System.out.println("1. Nasi goreng biasa");
        System.out.println("2. Nasi goreng spesial");
        System.out.println("3. Nasi goreng baksso");
        
        System.out.println("=====");
        
        if (pilihan == 1){
            System.out.println("anda memilih nasi goreng biasa");
        }else if(pilihan == 2){
            System.out.println("anda memilih nasi goreng spesial");
        }else if(pilihan == 3){
            System.out.println("anda memilih nasi goreng bakso");
        }else{
            System.out.println("pilihan tidak tersedia");
        }

    }

}
