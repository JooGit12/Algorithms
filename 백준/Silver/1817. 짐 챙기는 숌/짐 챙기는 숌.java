import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NM = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());
        
        if (N == 0) {System.out.println(0); return;}

        int[] booksWeights = new int[N];        
        StringTokenizer booksTokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < N; i++) {
            booksWeights[i] = Integer.parseInt(booksTokenizer.nextToken());
        }
        
        System.out.println(getMinBoxesNeeded(N, M, booksWeights));
        
        reader.close();
    }
    
    public static int getMinBoxesNeeded(int N, int M, int[] weights) {
        
        int boxes = 1;
        int currentBoxWeight = 0;
        
        for (int weight : weights) {
            if (currentBoxWeight + weight > M) {
                boxes++;
                currentBoxWeight = weight;
            } else {
                currentBoxWeight += weight;
            }
        }
        
        return boxes;
    }
}
