package minggu7;

public class Days086 {
    public static void main(String[] args) {
        
        int[] data = {8, 3, 10, 6, 2, 7};
        
        int min = data[0];
        
        for (int i = 1; i < data.length; i++) {
            if (data [i] < min) {
                min = data[i];
                
            }
            
        }
        System.out.println("Angka minimal dalah: " + min);
    }

}
