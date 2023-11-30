class Solution {
    public int solution(int order) {
        int answer = 0;
        String num369 = Integer.toString(order);
        
        for (int i = 0; i < num369.length(); i++) {
        	if (num369.charAt(i) == '3'
        			|| num369.charAt(i) == '6'
        			|| num369.charAt(i) == '9') {
        		answer++;
			}
        }
        
        return answer;
    }
}
