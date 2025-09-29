package minggu2;
import java.util.Scanner;
public class Days022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan sisi persegi: ");
        int sisi = input.nextInt();
        
        int luas = sisi*sisi;
        System.out.println("luas persegi adalah: " + luas);
        
        System.out.println("Msukan sisi persegi: " + sisi);
        System.out.println("luas persegi adalah: " + luas);
    }
    
}
