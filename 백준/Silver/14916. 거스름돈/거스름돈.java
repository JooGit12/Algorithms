import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(reader.readLine());
		System.out.println(getMinCoins(money));
	}
	
	private static int getMinCoins(int money) {
		
		int count = 0;
		
		while (true) {
			if (money % 5 == 0) {
				count += money / 5;
				return count;
			} else {
				money -= 2;
				count++;
			}
			if (money < 0) return - 1;
		}
		
	}
}
