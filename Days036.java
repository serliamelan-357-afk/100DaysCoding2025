package minggu3;

import java.util.Scanner;

public class Days036 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan nilai siswa: ");
        int nilai = input.nextInt();
        
        if(nilai > 75){
            System.out.println("selamat, anda dinyatakan lulus dengan predikat");
        }

        if (nilai >= 90) {
            System.out.println("A");
        } else if (nilai >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
            System.out.println("maaf, anda belum lulus");
        }

    }

}
