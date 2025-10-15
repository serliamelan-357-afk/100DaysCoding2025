package minggu3;

import java.util.Scanner;

public class Days038 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("masukan bilangan: ");
        int bilangan = a.nextInt();
        
        if(bilangan > 0){
            System.out.println("bilangan " + bilangan  + " adalah bilangan positif");
        }else if(bilangan < 0){
            System.out.println("bilangan " + bilangan  + " adalah bilangan negatif");
        }else{
            System.out.println("bilangan yang anda masukan adalah nol/0");
        }

    }

}
