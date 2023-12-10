import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (String str : strArr) {
			int length = str.length();
			frequencyMap.put(length, frequencyMap.getOrDefault(length, 0) + 1);
		}
        
        int maxFrequency = 0;
        
        for (int currentFrecuency : frequencyMap.values()) {
			if (currentFrecuency > maxFrequency) {
				maxFrequency = currentFrecuency;
			}
		}
        
        return maxFrequency;
    }
}
