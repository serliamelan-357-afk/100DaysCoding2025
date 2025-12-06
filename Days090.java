package minggu7;

public class Days090 {
    public static void main(String[] args) {
        
        int hasilTambah = tambah (10,5);
        String ucapan = salam();
        boolean genap = cekGenap(10);
        
        System.out.println("Hail penjumlahan: " + hasilTambah);
        System.out.println("Ucapan: " + ucapan);
        
        if (genap) {
            System.out.println("Angka 10 adalah genap");
            
        }else{
            System.out.println("Angka 10 adalah ganjil");
        }
      
    }
    public static int tambah(int a, int b){
        return a + b;
     
    }
    public static String salam(){
        return "Assalamualaikum, saya serli amelan";
        
    }
    public static boolean cekGenap(int angka){
        return angka % 2 == 0;
    }

}
