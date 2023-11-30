class Solution {
    public int solution(int num, int k) {
    	int answer = 0;    	
    	String a = num + "";
    	String b = k + "";
    	
    	for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(0)) {
				answer = i + 1;
                break;
			}
		}
    	
    	return (answer > 0) ? answer : - 1;
    }
}