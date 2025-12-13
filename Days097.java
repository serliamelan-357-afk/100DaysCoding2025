package minggu7;

public class Days097 {
    public static void main(String[] args) {
        int sisi = 6;
        
        System.out.println("Panjang sisi : " + sisi);
        System.out.println("Luas persegi : " + hitungLuas(sisi));
        
        
    }
    public static int hitungLuas(int s){
        int luas = s * s;
        return luas;
    }

}
