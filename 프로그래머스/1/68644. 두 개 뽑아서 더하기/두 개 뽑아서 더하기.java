import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
    	
    	Set<Integer> numSet = new HashSet<>();

    	for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				numSet.add(numbers[i] + numbers[j]);
			}
		}
    	
    	return numSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
