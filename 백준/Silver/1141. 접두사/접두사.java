import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] prefixXArr = new String[n];
		
		for (int i = 0; i < prefixXArr.length; i++) {
			String x = br.readLine();
			prefixXArr[i]= x;
		}
		
		Arrays.sort(prefixXArr);
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (prefixXArr[j].startsWith(prefixXArr[i])) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(prefixXArr.length - count);
	}
}