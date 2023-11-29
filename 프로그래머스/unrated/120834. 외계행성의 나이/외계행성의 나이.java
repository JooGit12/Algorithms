class Solution {
    public String solution(int age) {
    	String answer = "";
    	char[] charArray = Integer.toString(age).toCharArray();
    	
    	for (int i = 0; i < charArray.length; i++) {
			answer += (char)(charArray[i] + 49);
		}
    	
    	return answer;
    }
}
