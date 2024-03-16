import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		long score = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		if (n <= 0) {
			System.out.println(1);
			return;
		}

		StringTokenizer ranksToken = new StringTokenizer(br.readLine());
		int[] ranks = new int[n];

		for (int i = 0; i < n; i++) {
			ranks[i] = Integer.parseInt(ranksToken.nextToken());
		}

		if (n == p && ranks[n - 1] >= score) {
			System.out.println(-1);
			return;
		}

		int rank = 1;
		for (int i = 0; i < ranks.length; i++) {
			if (score >= ranks[i]) {
				rank = i + 1;
				break;
			} else {
				rank++;
			}
		}

		System.out.println((rank <= p) ? rank : -1);

		br.close();
	}
}
