package Evlauasi2Days55;

import java.util.Scanner;

public class SOAL1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
         System.out.println("Batas bawah: ");
         int BatasBawah = s.nextInt();
         System.out.println("Batas Atas: ");
         int BatasAtas = s.nextInt();
         System.out.println("Angka: ");
         int angka = s.nextInt();
         
         if (angka >= BatasBawah && angka <= BatasAtas) {
             System.out.println("YAYAYAYA");
        }else{
             System.out.println("NONONONO");
         }
    }

  //SOAL1



  package Evlauasi2Days55;

import java.util.Scanner;

public class SOAL2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Nilai: ");
        int nilai = s.nextInt();
        
        if (nilai > 70) {
            System.out.println("Ujian Kroco Ji pale");
            
        }else{
            System.out.println("Sa Jappo'ka Aih");
        }
    }

}

//SOAL2



package Evlauasi2Days55;

import java.util.Scanner;

public class SOAL3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Angka: ");
        int angka = s.nextInt();
        
        if (angka %2 == 0) {
            System.out.println("Iyaji");
            
        }else{
            System.out.println("Tidakji");
        }
    }

}

//SOAL3

}
