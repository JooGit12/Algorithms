import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        
        String L = tokens.nextToken();
        String R = tokens.nextToken();
        
        System.out.println(howMuchEight(L, R));
    }
    
    private static int howMuchEight(String L, String R) {
        int count = 0;
        boolean isDiffer = false;
        if (L.length() != R.length()) return 0;
        
        for (int i = 0; i < L.length(); i++) {
            if (L.charAt(i) != R.charAt(i)) {
                isDiffer = true;
            }
            if (!isDiffer && L.charAt(i) == '8') {
                count++;
            }
        }
        return count;
    }
}
