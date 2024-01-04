import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        int[] sortedEmergency = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(sortedEmergency);
        
        for (int i = 0; i < emergency.length; i++) {
			for (int j = 0; j < sortedEmergency.length; j++) {
				if (emergency[i] == sortedEmergency[j]) {
					answer[i] = sortedEmergency.length - j;
				}
			}
		}
        
        return answer;
    }
}
