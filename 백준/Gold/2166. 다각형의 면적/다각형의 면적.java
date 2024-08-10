import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        int[][] points = new int[N][2];
        double area = 0;
        
        for (int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            points[i][0] = Integer.parseInt(tokenizer.nextToken());
            points[i][1] = Integer.parseInt(tokenizer.nextToken());
        }
        
        area = calculateArea(points, N);
        
        System.out.printf("%.1f\n", area);
        reader.close();
    }
    
    private static double calculateArea(int[][] points, int n) {
        double area = 0;
        for (int i = 0; i < n; i++) {
            area += (double)points[i][0] * points[(i + 1) % n][1];
            area -= (double)points[i][1] * points[(i + 1) % n][0];
        }
        return Math.abs(area) / 2.0;
    }
}
