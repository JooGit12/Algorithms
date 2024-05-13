import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(reader.readLine());
            HashMap<String, Integer> clothesMap = new HashMap<>();

            for (int j = 0; j < M; j++) {
                StringTokenizer tokens = new StringTokenizer(reader.readLine());
                String clothesName = tokens.nextToken();
                String clothesCategory = tokens.nextToken();
                clothesMap.put(clothesCategory, clothesMap.getOrDefault(clothesCategory, 0) + 1);
            }
            
            int result = 1;
            for (int count : clothesMap.values()) {
                result *= (count + 1);
            }
            
            result -= 1;

            System.out.println(result);
        }
        
        reader.close();
    }
}
