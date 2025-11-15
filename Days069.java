package evaluasimetor;

import java.util.Scanner;

public class soal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jumlah karung: ");
        int jumlah = s.nextInt();

        System.out.print("Berat per karung: ");
        int berat = s.nextInt();

        int total = jumlah * berat;
        System.out.println("Total Berat: " + total);
    }

}


//soal1

package evaluasimetor;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan suhu ruang: ");
        int a = s.nextInt();

        if (a < 20) {
            System.out.println("dingin");

        } else if (a >= 30) {
            System.out.println("panas");
        } else  {
            System.out.println("normal");
        }

    }

}

//soal2


package evaluasimetor;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = s.nextInt();
        
        if (angka %2 == 0) {
            System.out.println("Gerban terbuka! (Genap)");
            
        }else{
            System.out.println("Gerbang tertutup (Ganjil)");
        }
          
            
    }

}

//soal3

}


package evaluasimetor;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        double angka = s.nextDouble();
        
        if (angka <= 12) {
            System.out.println("Negtif");
            
        }else if (angka > 0) {
            System.out.println("positif");
        }else{
            System.out.println("nol");
        }
    }

}
package evaluasimetor;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        double angka = s.nextDouble();
        
        if (angka <= 12) {
            System.out.println("Negtif");
            
        }else if (angka > 0) {
            System.out.println("positif");
        }else{
            System.out.println("nol");
        }
    }

}

//soal4

package evaluasimetor;

import java.util.Scanner;

public class soal5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jumlah petak: ");
        int petak = s.nextInt();

        int total = 0;

        for (int i = 1; i <= petak; i++) {
            System.out.print("Luas petak ke-" + i + ":");
            int petak1 = s.nextInt();
            total += petak1;

        }

        System.out.println("Total luas sawah: " + total);

    }

}
//soal5

