import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int inputsLen = Integer.parseInt(br.readLine());
		int[][] inputs = new int[inputsLen][2];
		
		for (int i = 0; i < inputsLen; i++) {
			inputs[i] = Arrays.stream(br.readLine().split(" "))
							.mapToInt(Integer::parseInt)
							.toArray();
		}
		
        Arrays.sort(inputs, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
		
        for (int[] input : inputs) {
			bw.write(input[0] + " " + input[1] + "\n");
		}
        
		bw.flush();
		bw.close();
		br.close();
	}
}
