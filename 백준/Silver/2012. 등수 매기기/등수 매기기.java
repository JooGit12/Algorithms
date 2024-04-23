import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        int[] ranks = new int[N];
        long answer = 0;
        
        for (int i = 0; i < ranks.length; i++) {
            ranks[i] = Integer.parseInt(reader.readLine());
        }
        
        Arrays.sort(ranks);
        
        for (int i = 0; i < ranks.length; i++) {
            answer += Math.abs(ranks[i] - i - 1);
        }
        
        System.out.println(answer);
        
        reader.close();
    }
}
