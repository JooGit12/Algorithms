import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
	public String solution(String my_string) {
		StringBuilder stringBuilder = new StringBuilder();
		
		Map<Character, Integer> charCount = new LinkedHashMap<>();

		for (char c : my_string.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		for (char c : charCount.keySet()) {
			stringBuilder.append(c);
		}

		return stringBuilder.toString();
	}
}
