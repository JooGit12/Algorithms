class Solution {
    public String[] solution(String my_str, int n) {
        
    	boolean isDivisible = (my_str.length() % n == 0);
    	int answerLen = (isDivisible) ? my_str.length() / n : my_str.length() / n + 1;
    	
    	String[] answer = new String[answerLen];
        
        for (int i = 0; i < answerLen; i++) {
        	int endIdx = (isDivisible) ? i * n + n : Math.min(i * n + n, my_str.length());
			answer[i] = my_str.substring(i * n, endIdx);
		}
        
        return answer;
    }
}
