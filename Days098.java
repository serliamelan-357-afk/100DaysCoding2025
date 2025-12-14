package minggu7;

public class Days098 {
    public static void main(String[] args) {
        int n = 10;
        
        int a = 0;
        int b = 1;
        System.out.println("Derte fibonacci sampai " + n + " angka:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            int c = a + b;
            
            a = b;
            b = c;
            
            
        }
    }

}
