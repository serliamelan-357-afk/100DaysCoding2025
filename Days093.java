package minggu7;

public class Days093 {
    public static void main(String[] args) {
        
        double angka1 = 7.2;
        double angka2 = 7.8;
        double angka3 = 7.5;
        
        System.out.println("===CEIL===");
        System.out.println("\n===FLOOR===");
        System.out.println("\n===ROUND===");
          
        
    }
    public static void tampilkanCeil(double angka){
        double hasil = Math.ceil(angka);
        System.out.println("Ceil dari " + angka + " = " + hasil);
    }
    public static void tampilkanFloor(double angka){
        double hasil = Math.floor(angka);
        System.out.println("Floor dari " + angka + " = " + hasil);
    }
    public static void tampilkanRound(double angka){
        long hasil = Math.round(angka);
        System.out.println("Round dari " + angka + " = " + hasil);
    }
   

}
