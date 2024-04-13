import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = reader.readLine().split(" ");
        String A = input[0];
        String B = input[1];
        
        int[] aArr = getMaxMin(A);
        int[] bArr = getMaxMin(B);
        
        System.out.println((aArr[1] + bArr[1]) + " " + (aArr[0] + bArr[0]));
        reader.close();
    }
    
    private static int[] getMaxMin(String num) {
        
        StringBuilder max = new StringBuilder();
        StringBuilder min = new StringBuilder();
        
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '5') {
                max.append('6');
                min.append('5');
            } else if (num.charAt(i) == '6') {
                max.append('6');
                min.append('5');
            } else {
                max.append(num.charAt(i));
                min.append(num.charAt(i));
            }
        }
        
        return new int[] {Integer.parseInt(max.toString()), Integer.parseInt(min.toString())};
    }
}
