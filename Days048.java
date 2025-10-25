package minggu4;

import java.util.Scanner;

public class Days048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("===KALKOLATOR===");
        System.out.println("Masukkan angka pertana: ");
        angka1 = sc.nextDouble();
        System.out.println("Masukan Operator (+, *, -, /");
        operator = sc.next().charAt(0);
        System.out.println("Masukkan angka kedua: ");
        angka2 = sc.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("hasil" + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("hasil" + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("hasil" + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    System.out.println("hasil" + hasil);
                    }
                } else {
                    System.out.println("Error: pembagian nol tidak boleh");
                }
                break;
            default:
                System.out.println("operator tidak ada");
        }

    }

}
