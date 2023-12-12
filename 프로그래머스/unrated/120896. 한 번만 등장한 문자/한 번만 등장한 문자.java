import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String s) {
    	Map<Character, Integer> charMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
    	
        for (char c : s.toCharArray()) {
			charMap.put(c, charMap.getOrDefault(c, 0) + 1);
		}
        
        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (char c : charMap.keySet()) {
			if (charMap.get(c) == 1) {
				uniqueChars.add(c);
			}
		}
        
        Collections.sort(uniqueChars);
        
        for (char c : uniqueChars) {
			sb.append(c);
		}
        
        return sb.toString();        
    }
}
