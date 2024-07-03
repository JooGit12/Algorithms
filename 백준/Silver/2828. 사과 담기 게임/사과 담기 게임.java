import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        int J = Integer.parseInt(reader.readLine());
        
        int start = 1;
        int end = M;
        int totalMoves = 0;
        
        for (int i = 0; i < J; i++) {
            int apple = Integer.parseInt(reader.readLine());
            if (apple < start) {
                int movesLeft = start - apple;
                totalMoves += movesLeft;
                start -= movesLeft;
                end -= movesLeft;
            } else if(apple > end){
                int movesRight = apple - end;
                totalMoves += movesRight;
                start += movesRight;
                end += movesRight;
            }
        }
        
        System.out.println(totalMoves);
        reader.close();
    }
}
