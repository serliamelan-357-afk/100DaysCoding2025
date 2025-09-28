  package minggu2;
public class Days021 {
    public static void main(String[] args) {
        int angka1 = 20;
        int angka2 = 50;
        
        System.out.println("sebelum ditukar: ");
        System.out.println("angka1 = " + angka1);
        System.out.println("angka2 = " + angka2);
        
        angka1 = angka1 + angka2;
        angka2 = angka1 - angka2;
        angka1 = angka1 - angka2;
        
        System.out.println("\nSesudah ditukar: ");
        System.out.println("angka1 = " + angka1);
        System.out.println("angka2 = " + angka2);
       

    }

}

    
