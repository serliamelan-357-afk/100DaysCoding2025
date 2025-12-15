 
package minggu7;
 
public class Days099 {
    public static void main(String[] args) {
        int s = 20;
        
        System.out.println("Bilangan prima dari 1 sampai " + s + ":");
        
        for (int i = 2; i <= s; i++) {
            boolean prima = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                    
                }
                
            }
            if (prima) {
                System.out.println(i + " ");
                
            }
                
            
            
        }
    }
    
}
