package minggu4;

import java.util.Scanner;

public class Days046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==MENU MAKANAN==");
        System.out.println("1. Nasi goreng");
        System.out.println("2. Bakso urat");
        System.out.println("3. Mie Ayam");
        System.out.println("4. Soto Makassar");
        System.out.println("Pilih Menu (1-4)");

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Nasi goreng. harga: Rp20.000");
                break;
            case 2:
                System.out.println("Bakso urat. harga:20.000");
                break;
            case 3:
                System.out.println("Mie Ayam. harga:13.000");
                break;
            case 4:
                System.out.println("Soto Makassar. harga:25.000");
                break;
            default:
                System.out.println("Pilihan tidak ada. pilih 1-4");
                break;
        }
    }

}
