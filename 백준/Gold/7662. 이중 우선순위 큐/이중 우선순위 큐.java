import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(reader.readLine()); // 테스트 케이스 수 입력
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(reader.readLine()); // 각 테스트 케이스의 명령 수 입력
            PriorityQueue<Integer> maxQ = new PriorityQueue<>(Comparator.reverseOrder()); // 최대 힙
            PriorityQueue<Integer> minQ = new PriorityQueue<>(); // 최소 힙
            Map<Integer, Integer> countMap = new HashMap<>(); // 각 값의 삽입 횟수 기록
            
            for (int j = 0; j < N; j++) {
                String[] temp = reader.readLine().split(" ");
                int num = Integer.parseInt(temp[1]);
                if (temp[0].equals("I")) {
                    // 삽입 명령
                    maxQ.offer(num);
                    minQ.offer(num);
                    countMap.put(num, countMap.getOrDefault(num, 0) + 1);
                } else {
                    // 삭제 명령
                    if (num == -1) {
                        // 최솟값 삭제
                        removeElement(minQ, countMap);
                    } else {
                        // 최댓값 삭제
                        removeElement(maxQ, countMap);
                    }
                }
            }
            
            // 유효하지 않은 값 제거
            while (!maxQ.isEmpty() && countMap.get(maxQ.peek()) == 0) {
                maxQ.poll();
            }
            while (!minQ.isEmpty() && countMap.get(minQ.peek()) == 0) {
                minQ.poll();
            }
            
            // 결과 출력
            if (maxQ.isEmpty() || minQ.isEmpty()) {
                writer.write("EMPTY\n");
            } else {
                writer.write(maxQ.peek() + " " + minQ.peek() + "\n");
            }
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
    
    private static void removeElement(PriorityQueue<Integer> queue, Map<Integer, Integer> countMap) {
        while (!queue.isEmpty()) {
            int num = queue.poll();
            int count = countMap.getOrDefault(num, 0);
            if (count > 0) {
                countMap.put(num, count - 1);
                break;
            }
        }
    }
}
