import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] lenAndMoney = reader.readLine().split(" ");
		
		
		int inputsLen = Integer.parseInt(lenAndMoney[0]);
		int money = Integer.parseInt(lenAndMoney[1]);
		int answer = 0;
		
		int[] coins = new int[inputsLen];
		
		for (int i = inputsLen - 1; i >= 0; i--) {
			coins[i] = Integer.parseInt(reader.readLine());
		}
		
		for (int coin : coins) {
			if (coin > money) continue;
			answer += money / coin;
			money %= coin;
		}
		
		System.out.println(answer);
	}
}
