import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        
        int N = Integer.parseInt(reader.readLine());
        
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(reader.readLine());
            
            if (maxHeap.size() == minHeap.size()) {
                maxHeap.offer(num);
                if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                    minHeap.offer(maxHeap.poll());
                    maxHeap.offer(minHeap.poll());
                }
            } else {
                minHeap.offer(num);
                if (maxHeap.peek() > minHeap.peek()) {
                    minHeap.offer(maxHeap.poll());
                    maxHeap.offer(minHeap.poll());
                }
            }
            
            builder.append(maxHeap.peek()).append("\n");
        }
        
        System.out.println(builder.toString());
        reader.close();
    }
}
