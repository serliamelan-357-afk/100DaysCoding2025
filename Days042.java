package minggu4;

import java.util.Scanner;

public class Days042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan gaji pokok: ");
        double gajipokok = sc.nextDouble();
        System.out.println("Masukan tunjangan: ");
        double tunjangan = sc.nextDouble();
        
        double totalpendapatan = gajipokok + tunjangan;
        double potongan = 0;
        
        if(totalpendapatan > 5000000){
            potongan = totalpendapatan * 0.10;
        }else{
            potongan = totalpendapatan * 0.05;
        }
        double gajiBersih = totalpendapatan - potongan;
        
        System.out.println("\n==Hasil perhitungan gaji bersih==");
        System.out.println("Total pendapatan: " + totalpendapatan);
        System.out.println("potongan: " + potongan);
        System.out.println("Gajih bersih : " + gajiBersih);
    }

}
