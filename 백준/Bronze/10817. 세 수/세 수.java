import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        Queue<Integer> pq = new PriorityQueue<Integer>();
        
        int[] abc = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(abc);
        
        System.out.print(abc[1]);
        
        reader.close();
    }
}
