import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        int answer = 0;
        Queue<String> q = new LinkedList<String>();

        for (String city : cities) {
            city = city.toLowerCase();

            if (q.contains(city)) {
                q.remove(city);
                answer++;
            } else {
                if (q.size() >= cacheSize) q.poll();
                answer += 5;
            }
            q.offer(city);
        }
        return answer;
    }
}

