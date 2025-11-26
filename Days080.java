package minggu6;

public class Days080 {

    public static void main(String[] args) {
        int[] data = {4, 7, 4, 8, 8, 2, 7, 7};

        int modus = data[0];
        int Max = 0;

        for (int i = 0; i < data.length; i++) {
            int Count = 0;
            for (int j = 0; j < data.length; j++) {
                if (data[j] == data[i]) {
                    Count++;
                }

            }

            if (Count > Max) {
                Max = Count;
                modus = data[i];

            }
        }
        System.out.println("Modus = " + modus);

    }

}
