public class Solution {
    public int solution(int n) {
    	
    	String numToStr = Integer.toString(n);
    	int answer = 0;
    	
    	for (int i = 0; i < numToStr.length(); i++) {
			answer += Character.getNumericValue(numToStr.charAt(i));
		}
    	
    	return answer;
    }
}
