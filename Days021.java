package minggu2;
public class Days021 {
    public static void main(String[] args) {
        int a = 20, b = 10;
        System.out.println("sebelum ditukar: a = " + a + ",b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("sesudah ditukar: a = " + a + ", b = " + b);
       

    }

}
