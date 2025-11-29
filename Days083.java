package minggu6;

public class Days083 {
    public static void main(String[] args) {
        
      
        int[] angka = { 2, 5, 8, 10, 18};
        int total = 0;
        
        for (int i = 0; i < angka.length; i++) {
            total = total + angka[i];
            
        }
        System.out.println("Isi array : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i] + " ");
            
        }
        System.out.println("\nJumlah semua angka array: " + total);
        
        
    }

}
