import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
    	String numbersOnly = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[numbersOnly.length()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = Character.getNumericValue(numbersOnly.charAt(i));
		}
        
        Arrays.sort(answer);
        
        return answer;
    }
}
