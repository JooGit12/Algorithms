import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NM = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());
        
        int[] A = new int[N];
        
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(tokenizer.nextToken());
        }

        System.out.print(countSubarraysWithSum(N, M, A));
        reader.close();
    }
    
    public static int countSubarraysWithSum(int N, int M, int[] A) {
        int count = 0;
        int cumulativeSum = 0;
        
        Map<Integer, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0, 1);
        
        for (int i = 0; i < N; i++) {
            cumulativeSum += A[i];
            
            count += prefixCounts.getOrDefault(cumulativeSum - M, 0);
            
            prefixCounts.put(cumulativeSum, prefixCounts.getOrDefault(cumulativeSum, 0) + 1);
        }
        
        return count;
    }
}
