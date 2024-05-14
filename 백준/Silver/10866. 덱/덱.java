import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<String> deq = new ArrayDeque<>();
        
        int N = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < N; i++) {
            String readLine = reader.readLine();

            if (readLine.contains("push_front")) {
                deq.addFirst(readLine.substring(11));
                continue;
            } 

            if (readLine.contains("push_back")) {
                deq.addLast(readLine.substring(10));
                continue;
            } 

            if (readLine.equals("pop_front")) {
                writer.append((deq.isEmpty()) ? "-1" : deq.pollFirst()).append("\n");
                continue;
            } 

            if (readLine.equals("pop_back")) {
                writer.append(deq.isEmpty() ? "-1" : deq.pollLast()).append("\n");
                continue;
            } 

            if (readLine.equals("size")) {
                writer.append(Integer.toString(deq.size())).append("\n");
                continue;
            } 

            if (readLine.equals("empty")) {
                writer.append((deq.isEmpty()) ? "1" : "0").append("\n");
                continue;
            } 

            if (readLine.equals("front")) {
                writer.append(deq.isEmpty() ? "-1" : deq.peekFirst()).append("\n");
                continue;
            } 

            writer.append(deq.isEmpty() ? "-1" : deq.peekLast()).append("\n");
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
