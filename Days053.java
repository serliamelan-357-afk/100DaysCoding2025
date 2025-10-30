package minggu4;

import java.util.Scanner;

public class Days053 {

    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);
        

        System.out.print("Masukkan angka pertama: ");
        int angka = p.nextInt();
        System.out.print("Masukkan batas: ");
        int batas = p.nextInt();

        for (int i = angka; i < batas; i++) {
            System.out.println("Perulangan ke- " + i);
            if (i == 5) {
                System.out.println("Perulangan berhenti");
                break;
            }
        }
    }

}
