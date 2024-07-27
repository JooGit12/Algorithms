import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Queue<Character> pq = new PriorityQueue<Character>(Collections.reverseOrder());
        StringBuilder builder = new StringBuilder();
        String N = reader.readLine();
        
        for (Character c : N.toCharArray()) {
            pq.offer(c);
        }
        
        while (!pq.isEmpty()) {
            builder.append(pq.poll());
        }
        
        System.out.println(builder.toString());
    }
}
