import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(reader.readLine());
		
		Queue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int absO1 = Math.abs(o1);
				int absO2 = Math.abs(o2);
				
				if (absO1 == absO2) {
					return o1.compareTo(o2);
				}
				
				return absO1 - absO2;
			}
		});

		
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(reader.readLine());
			if (x == 0) {
				writer.append((pq.isEmpty()) ? "0\n" : pq.poll() + "\n");
			} else {
				pq.offer(x);				
			}
		}
		
		writer.flush();
		writer.close();
		reader.close();
	}
}
