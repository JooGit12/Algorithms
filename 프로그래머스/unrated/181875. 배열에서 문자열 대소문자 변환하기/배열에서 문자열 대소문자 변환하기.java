class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = (i % 2 == 0) ? strArr[i].toLowerCase() : strArr[i].toUpperCase(); 
		}
        
        return answer;
    }
}
