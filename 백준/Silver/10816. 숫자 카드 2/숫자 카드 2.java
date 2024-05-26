import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> sanguenCardsMap = new HashMap<>(); 
        StringBuilder builder = new StringBuilder();
        
        int N = Integer.parseInt(reader.readLine());
        String[] sanguenCards = reader.readLine().split(" ");
        int M = Integer.parseInt(reader.readLine());
        String[] solutionCards = reader.readLine().split(" ");
        
        for (int i = 0; i < N; i++) {
            String sanguenCard = sanguenCards[i];
            sanguenCardsMap.put(sanguenCard, sanguenCardsMap.getOrDefault(sanguenCard, 0) + 1);
        }
        
        for (int i = 0; i < M; i++) {
            String solutionCard = solutionCards[i];
            if (sanguenCardsMap.containsKey(solutionCard)) {
                builder.append(sanguenCardsMap.get(solutionCard)).append(" ");                
            } else {
                builder.append("0 ");
            }
        }
        
        System.out.println(builder.toString());
        reader.close();
    }
}
