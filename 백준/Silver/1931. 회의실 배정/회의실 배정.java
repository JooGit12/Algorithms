import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int len = Integer.parseInt(br.readLine());

		int[][] meetings = new int[len][2];

		for (int i = 0; i < len; i++) {
			String[] strArr = br.readLine().split(" ");
			meetings[i][0] = Integer.parseInt(strArr[0]);
			meetings[i][1] = Integer.parseInt(strArr[1]);
		}

		Arrays.sort(meetings, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});

		int answer = 0;
		int time = 0;
		
		for (int i = 0; i < len; i++) {
			if (time <= meetings[i][0]) {
				time = meetings[i][1];
				answer++;
			}
		}
		
		System.out.println(answer);
	}
}
