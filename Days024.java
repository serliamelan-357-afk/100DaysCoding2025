
package minggu2;

import java.util.Scanner;

public class Days024 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan panjang: ");
        System.out.println("maskan lebar: ");
        double angka1 = input.nextDouble();

        double angka2 = input.nextDouble();

        double luas = angka1 * angka2;
        double keliling = 3 * (angka1 + angka2);

        System.out.println("luas persegi panjang= " + luas);
        System.out.println("luas persegi panjang= " + keliling);

    }

}
