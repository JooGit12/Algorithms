import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));        
        Queue<Integer> pq = new PriorityQueue<Integer>();
        
        int N = Integer.parseInt(reader.readLine());
        long answer = 0;
        
        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(reader.readLine()));
        }
        
        for (int i = 0; i < N; i++) {
            answer += Math.abs(pq.poll() - i - 1);
        }
        
        System.out.println(answer);
        reader.close();
    }
}
