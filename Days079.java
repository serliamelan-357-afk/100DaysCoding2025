package minggu6;

import java.util.Scanner;

public class Days079 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("===BUAT===");
        System.out.println("Masukkan Username: ");
        String user = s.nextLine();
        System.out.println("Masukkan Password: ");
        int sandi = s.nextInt();
        s.nextLine();

        while (true) {
            System.out.println("===Login===");

            System.out.println("Username: ");
            String nama = s.nextLine();

            System.out.println("Password");
            int pass = s.nextInt();
            s.nextLine();

            if (nama.equalsIgnoreCase(user) && pass == sandi) {
                System.out.println("\nANDA BERHASIL LOGIN!");
                break;
            } else {
                System.out.println("User atau password salah! Coba lagi.\n");
            }

        }

    }

}
