import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNumber = br.readLine();

        int[] count = new int[10];
        for (int i = 0; i < roomNumber.length(); i++) {
            count[roomNumber.charAt(i) - 48]++;
        }

        int sixAndNine = (count[6] + count[9] + 1) / 2;

        int max = sixAndNine;
        for (int i = 0; i < 10; i++) {
            if (i != 6 && i != 9) {
                max = Math.max(max, count[i]);
            }
        }

        System.out.println(max);
    }
}
