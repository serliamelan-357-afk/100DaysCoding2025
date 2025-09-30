package minggu2;
import java.util.Scanner;
public class Days023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan panjang: ");
        double panjang = input.nextDouble();
        
        System.out.println("Masukkan lebar: ");
        double lebar = input.nextDouble();
        
        double luas = panjang*lebar;
        
        System.out.println("Luas persegi panjang = " + luas + "cm");
        
    }
}
