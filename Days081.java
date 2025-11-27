package minggu6;

public class Days081 {
    public static void main(String[] args) {
        int [] angka = {3, 6, 9, 12};
        
        int temp = angka[1];
        angka[1] = angka[3];
        angka[3] = temp;
        
        System.out.println("Setelah ditukar: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i] + " ");
            
        }
    }

}
