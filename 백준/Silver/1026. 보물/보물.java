import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());

        int[] arrA = readInputs(br, len);
        int[] arrB = readInputs(br, len);

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int answer = calculateMinimumSum(arrA, arrB);
        
        System.out.println(answer);
        br.close();
    }

    private static int[] readInputs(BufferedReader br, int len) throws IOException {
        int[] arr = new int[len];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        return arr;
    }

    private static int calculateMinimumSum(int[] arrA, int[] arrB) {
        int sum = 0;
        for (int i = 0; i < arrB.length; i++) {
            sum += (arrA[i] * arrB[arrB.length - 1 - i]);
        }
        return sum;
    }
}
