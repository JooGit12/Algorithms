import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "*";
		try {
			int a = Integer.parseInt(br.readLine());
			for (int i = 0; i < a; i++) {
				System.out.println(s.repeat(i + 1));				
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
