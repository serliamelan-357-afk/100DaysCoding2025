package minggu4;

public class Days051 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Angka ke-" + i);
            
            if(i % 2 == 0){
                System.out.println(i + "adalah bilangan genap");
            }else{
                System.out.println(i + "adalah bilangan ganjil");
            }
        }
    }
