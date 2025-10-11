package minggu3;

public class Days034 {

    public static void main(String[] args) {
        
        
        int c = 10;
        int d = 20;
        boolean aktif = true;

        // Operator perbandingan
        System.out.println("c == d : " + (c == d));
        System.out.println("c != d : " + (c !=d));
        System.out.println("c < d : " + (c < d));
        System.out.println("c > d  : " + (c > d));
        System.out.println("c <= d : " + (c <= d));
        System.out.println("c >= d : " + (c >= d));

        // Operator logika
        System.out.println("(c < d) && (d > 5)  : " + ((c < d) && (d > 5)));
        System.out.println("(c > d) || (d > 5)  : " + ((c > d) || (d > 5)));
        System.out.println("!aktif              : " + (!aktif));

        // Kombinasi logika
        boolean hasil = (c < d) && (d > 5) && aktif;
        System.out.println("semua terpenuhi? " + hasil);
    }
}
        
        
    
