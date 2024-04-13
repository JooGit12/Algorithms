import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        int answer = 0;
        Integer[] ropes = new Integer[N];
        
        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(reader.readLine());
        }
        
        Arrays.sort(ropes, (a, b) -> b - a);
        
        for (int i = 0; i < ropes.length; i++) {
            int maxRopeWeight = (i + 1) * ropes[i];
            answer = Math.max(answer, maxRopeWeight);
        }
        
        System.out.println(answer);
        reader.close();
    }
}
