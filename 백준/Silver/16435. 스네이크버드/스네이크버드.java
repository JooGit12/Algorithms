import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(tokenizer.nextToken());
        int L = Integer.parseInt(tokenizer.nextToken());

//        PriorityQueue<Integer> treeLens = new PriorityQueue<>(
//                Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toList());

        PriorityQueue<Integer> treeLens = new PriorityQueue<>();
        Arrays.stream(reader.readLine().split(" "))
              .mapToInt(Integer::parseInt)
              .forEach(treeLens::offer);
        
        for (int i = 0; i < N; i++) {
            if (treeLens.poll() > L)break;
                L++;
        }

        System.out.println(L);
        reader.close();
    }
}
