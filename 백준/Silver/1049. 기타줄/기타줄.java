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
        int minPackagePrice = Integer.MAX_VALUE;
        int minSinglePrice = Integer.MAX_VALUE;
        
        for (int i = 0; i < M; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int packagePrice = Integer.parseInt(tokenizer.nextToken());
            int singlePrice = Integer.parseInt(tokenizer.nextToken());
            
            minPackagePrice = Math.min(minPackagePrice, packagePrice);
            minSinglePrice = Math.min(minSinglePrice, singlePrice);
        }
        
        minPackagePrice = Math.min(minPackagePrice, minSinglePrice * 6);
        
        int totalCost = 0;

        int packagesNeeded = N / 6;
        int remainingStrings = N % 6;

        totalCost += packagesNeeded * minPackagePrice;

        totalCost += Math.min(remainingStrings * minSinglePrice, minPackagePrice);

        System.out.print(totalCost);
        
        reader.close();
    }
}
