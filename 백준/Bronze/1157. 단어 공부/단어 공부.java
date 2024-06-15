import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine().toUpperCase();
        reader.close();

        Map<Character, Integer> wordMap = new HashMap<>();
        
        for (char c : input.toCharArray()) {
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
        }
        
        int maxFrequency = 0;
        char maxChar = '?';
        boolean isDuplicate = false;
        
        for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxChar = entry.getKey();
                isDuplicate = false;
            } else if (entry.getValue() == maxFrequency) {
                isDuplicate = true;
            }
        }
        
        System.out.println((isDuplicate) ? "?" : maxChar);
    }
}
