import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        Queue<Integer> q = new LinkedList<>();
        
        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());
        
        writer.write('<');
        
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        
        while (!q.isEmpty()) {
            for (int i = 1; i < K; i++) {
                q.offer(q.poll());
            }
            writer.append(Integer.toString(q.poll()));
            if (!q.isEmpty()) {
                writer.append(',').append(' ');
            }
        }
        
        writer.write('>');
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
