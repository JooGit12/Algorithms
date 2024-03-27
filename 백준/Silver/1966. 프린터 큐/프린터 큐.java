import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testLen = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testLen; i++) {
			String[] inputs = br.readLine().split(" ");
			int docsLen = Integer.parseInt(inputs[0]);
			int docIndex = Integer.parseInt(inputs[1]);
			
			LinkedList<int[]> q = new LinkedList<>();
			String[] docs = br.readLine().split(" ");
			
			for (int j = 0; j < docsLen; j++) {
				q.offer(new int[] {j, Integer.parseInt(docs[j])});
			}
			
			int count = 0;
			
			while (!q.isEmpty()) {
				int[] front = q.poll();
				boolean isMax = true;
				
				for (int j = 0; j < q.size(); j++) {
					if (front[1] < q.get(j)[1]) {
						q.offer(front);
						isMax = false;
						break;
					}
				}
				
				if (!isMax) {
					continue;
				}
				count++;
				
				if (front[0] == docIndex) {
					break;
				}
			}
			bw.write(Integer.toString(count));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
