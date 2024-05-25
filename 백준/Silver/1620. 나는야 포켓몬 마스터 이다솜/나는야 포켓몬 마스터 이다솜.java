import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        Map<Integer, String> numKeyMap = new HashMap<>();
        Map<String, Integer> monKeyMap = new HashMap<>();
        
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        int count = 1;
        
        for (int i = 0; i < N; i++) {
            String poketmon = reader.readLine();
            numKeyMap.put(count, poketmon);
            monKeyMap.put(poketmon, count);
            count++;
        }
        
        for (int i = 0; i < M; i++) {
            String str = reader.readLine();
            if (str.matches("\\d+")) {
                writer.append(numKeyMap.get(Integer.parseInt(str))).append("\n");
            } else {
                writer.write(monKeyMap.get(str) + "\n");
            }
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
