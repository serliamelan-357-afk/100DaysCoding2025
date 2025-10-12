package minggu3;
import java.util.Scanner;
public class Days035 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
        System.out.println("Masukan nilai anda: ");
        int nilai = input.nextInt();
        
        if(nilai >= 70){
            System.out.println("Dinyatakan Lulus");
        }else{
            System.out.println("Dinyatakan tidak Lulus");
        }
     
     

    }

}
