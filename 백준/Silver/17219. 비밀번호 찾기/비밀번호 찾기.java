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
        StringTokenizer NM = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());
        
        Map<String, String> sitePassword = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            sitePassword.put(token.nextToken(), token.nextToken());
        }
        
        for (int i = 0; i < M; i++) {
            writer.append(sitePassword.get(reader.readLine())).append("\n");
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
