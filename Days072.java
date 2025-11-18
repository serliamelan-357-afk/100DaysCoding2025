package minggu6;

public class Days072 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = n; i >= 1; i--) {

            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for (int b = 0; b < (2 * i - 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = n; i >= 1; i--) {

            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }

            for (int b = 1; b <= i; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



