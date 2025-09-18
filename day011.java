package minggu1;
import java.util.Scanner;
public class days11 {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
        System.out.print("masukan nama: ");
         String Nama = input.nextLine();
         
        System.out.print("masukan umur: ");
         int Umur = input.nextInt();
         
        System.out.print("masukan tinggi badan: ");
          double Tinggi = input.nextDouble();
          
        System.out.println("masukan tanggl lahir: ");
           char tanggalLahir = input.next().charAt(17);
           
