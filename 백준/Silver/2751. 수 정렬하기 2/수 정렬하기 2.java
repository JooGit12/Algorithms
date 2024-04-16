import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(reader.readLine());
        Queue<Integer> inputs = new PriorityQueue<>();
//        int[] inputs = new int[N];
//        
//        for (int i = 0; i < N; i++) {
//            inputs[i] = Integer.parseInt(reader.readLine());
//        }
//        
//        for (int i = 0; i < N - 1; i++) {
//            int minIdx = i;
//            for (int j = i + 1; j < N; j++) {
//                if (inputs[j] < inputs[minIdx]) {
//                    minIdx = j;
//                }
//            }
//            int temp = inputs[i];
//            inputs[i] = inputs[minIdx];
//            inputs[minIdx] = temp;
//        }
        
        for (int i = 0; i < N; i++) {
            inputs.offer(Integer.parseInt(reader.readLine()));
        }
        
        for (int i = 0; i < N; i++) {
            writer.write(Integer.toString(inputs.poll()));
            writer.newLine();
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
