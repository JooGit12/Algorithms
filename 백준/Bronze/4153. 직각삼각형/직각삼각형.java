import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = reader.readLine()).equals("0 0 0")) {
            String[] inputs = input.split(" ");
            int[] triangleArr = new int[3];

            for (int i = 0; i < triangleArr.length; i++) {
                triangleArr[i] = Integer.parseInt(inputs[i]);
            }

            Arrays.sort(triangleArr);

            System.out.println((triangleArr[2] * triangleArr[2] == triangleArr[1] * triangleArr[1] + triangleArr[0] * triangleArr[0]) ? "right" : "wrong");
        }
    }
}
