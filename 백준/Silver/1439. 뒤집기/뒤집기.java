import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int countZero = 0;
        int countOne = 0;
        
        if (input.charAt(0) == '0') {
            countZero = 1;
        }else {
            countOne = 1;
        }
        
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) != input.charAt(i + 1)) {
                if (input.charAt(i + 1) == '0') {
                    countZero++;
                } else {
                    countOne++;
                }
            }
        }
        
        System.out.println(Math.min(countZero, countOne));
    }
}
