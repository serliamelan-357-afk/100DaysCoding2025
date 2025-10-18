package EvaluasiMentor;

import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pengguna: ");
        String nama = input.nextLine();
        System.out.print("Masukkan angka dalam bentuk String: ");
        String angka = input.nextLine();


        int b = Integer.parseInt(angka);
        b++;
        b--;
        b += 7;
        b -= 4;

        String a = String.valueOf(b);

        System.out.println("Nama: " + nama);
        System.out.println("Nilai akhir :" + b);
        System.out.println("Nilai akhir :" + a);

    }

}

// soal pertama





package EvaluasiMentor;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("== pilihan Bangun Datar==");
        System.out.println("1. persegi");
        System.out.println("2. persegi panjang");
        System.out.println("3. luas Lingkaran");

        System.out.print("masukkan pilihan:");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println("Masukkan sisi:");
            int sisi = sc.nextInt();
            int luas = sisi * sisi;
            System.out.println("persegi: " + luas);

        } else if (pilihan == 2) {
            System.out.println("Masukkan sisi: ");
            int panjang = sc.nextInt();
            int lebar = sc.nextInt();
            int luas = panjang * lebar;
            System.out.println("persegipanjang " + luas);
        } else if (pilihan == 3) {
            int lebar = sc.nextInt();
            int sisi = sc.nextInt();
            double luas = 3.14 * (sisi * sisi);
            System.out.println("luas bangunan " + luas);
        }

    }
}

// soal ledua



package EvaluasiMentor;

import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama siswa : ");
        String nama = input.nextLine();
        System.out.println("Masukkan nilai siswa : ");
        int nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println(  "siswa" + nama + " sangat baik ");
        } else if (nilai >= 75) {
            System.out.println("Siswa : " + nama + " baik ");
        } else if (nilai >= 60) {
            System.out.println("siswa : " + nama + " cukup ");
        } else if (nilai < 60) {
            System.out.println("Siswa : " + nama + " tidak lulus ");
        }  if (nilai % 2 == 0) {
            System.out.println("Nilai genap");
        } else {
            System.out.println("Nilai ganjil");
        }
    }

}

// soal ketiga



import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama kasir: ");
        String nama = sc.nextLine();
        System.out.println("Masukkan harga barang (Rp) :");
        double harga = sc.nextDouble();
        double TotalDiskon = 0;
        double HargaAkhir = 0;

        if (harga > 1000000) {
            TotalDiskon = (harga * 20) / 100;
            HargaAkhir = harga - TotalDiskon;
            System.out.println("Mendapat diskon");
        } else if (harga >= 5000000 || harga <= 10000000) {
            
             TotalDiskon = (harga * 10) / 100;
             HargaAkhir = harga - TotalDiskon;
            System.out.println("Mendapat diskon");
        } else {
            System.out.println("tidak mendapat diskon");
        }

        System.out.println("\n==== STRUK PEMBAYARAN ===");
        System.out.println("Kasir           : " + nama);
        System.out.println("Harga barang    : " + "RP " + harga);
        System.out.println("Diskon (10.0%)  : " + "Rp " + TotalDiskon );
        System.out.println("Total Bayar     : " + "Rp " + HargaAkhir);

    }

}
// soal keempat



package EvaluasiMentor;

import java.util.Scanner;

public class soal5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==Menu pilihan==");
        System.out.println("1. penjumlahan");
        System.out.println("2. perkalian");
        System.out.println("3. pembagian");
        System.out.println("4. pengurangan");

        System.out.println("Masukan angka pertama : ");
        int a = input.nextInt();
        System.out.println("Masukan angka kedua : ");
        int b = input.nextInt();
        
        
        System.out.println("Masukan pilihan anda: ");
         char pilihan = input.next().charAt(0);
        
        if (pilihan == '1') {
            System.out.println((a + b));

        }
        if (pilihan == '2') {
            System.out.println((a * b));
        }
        if (pilihan == '3') {
            System.out.println((a / b));
        }
        if (pilihan == '4') {
            System.out.println((a - b));
        }

    }

}

// soal tambahan



