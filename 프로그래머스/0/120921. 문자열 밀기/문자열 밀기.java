class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String copiedStr = A;
        
        for (int i = 0; i < A.length(); i++) {
			if (copiedStr.equals(B)) {
				return answer;
			}
			
			String pushedStr = copiedStr.substring(copiedStr.length() - 1);
			copiedStr = pushedStr + copiedStr.substring(0, copiedStr.length() - 1);
			answer++;
		}
        
        return - 1;
    }
}
