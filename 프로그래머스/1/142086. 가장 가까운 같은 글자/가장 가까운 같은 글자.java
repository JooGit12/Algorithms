import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        Map<Character, Integer> indexMap = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
			if (!indexMap.containsKey(s.charAt(i))) {
				answer[i] = - 1;
				indexMap.put(s.charAt(i), i);
			}else {
				answer[i] = i - indexMap.get(s.charAt(i));
				indexMap.put(s.charAt(i), i);
			}
		}
        
        return answer;
    }
}
