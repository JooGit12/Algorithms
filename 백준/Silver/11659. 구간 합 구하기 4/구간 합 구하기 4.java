import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nm = new StringTokenizer(reader.readLine());
        StringTokenizer numsToken = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(nm.nextToken());
        int M = Integer.parseInt(nm.nextToken());
        int [] nums = new int [N + 1];
        
        for (int i = 1; i <= N; i++) {
            nums[i] = nums[i - 1] + Integer.parseInt(numsToken.nextToken());
        }
        
        for (int i = 0; i < M; i++) {
            StringTokenizer section = new StringTokenizer(reader.readLine());
            int start = Integer.parseInt(section.nextToken()) - 1;
            int end = Integer.parseInt(section.nextToken());
            System.out.println(nums[end] - nums[start]);
        }
        
        reader.close();
    }
}
