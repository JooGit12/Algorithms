import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(reader.readLine());
        
        LinkedList<String> q = new LinkedList<>();
        
        for (int i = 0; i < N; i++) {
            String[] input = reader.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    q.offer(input[1]);
                    break;
                case "pop":
                    String element = q.poll();
                    writer.append(element != null ? element : "-1").append("\n");
                    break;
                case "size":
                    writer.append(Integer.toString(q.size())).append("\n");
                    break;
                case "empty":
                    writer.append(q.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front":
                    writer.append(q.isEmpty() ? "-1" : q.peek()).append("\n");
                    break;
                case "back":
                    writer.append(q.isEmpty() ? "-1" : q.peekLast()).append("\n");
                    break;
            }
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
