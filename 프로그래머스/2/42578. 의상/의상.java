import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> clothesMap = new HashMap<>();
       
        for (int i = 0; i < clothes.length; i++) {
        	clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 1) + 1);
		}
        
        for (String clothe : clothesMap.keySet()) {
			answer *= clothesMap.get(clothe);
		}
        
        return answer - 1;
    }
}
