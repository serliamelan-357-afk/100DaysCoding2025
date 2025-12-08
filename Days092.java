package minggu7;

public class Days092 {
    public static void main(String[] args) {
        int hasilTambah = tambah(10, 5);
        System.out.println("Hasil Penjumlahan: " + hasilTambah);
        String Kategori = cekNilai(hasilTambah);
        System.out.println("Kategori Nilai: " + Kategori);
        
        
    }
    public static int tambah(int a, int b){
        int hasil = a + b;
        return hasil;
    }
    public static String cekNilai(int n){
        if (n >= 15) {
            return "Bagus";
            
        }
        return "Kurang";
    }
    

}
