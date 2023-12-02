class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for (int i = 1; i <= 10; i++) {
			answer *= i;
			if (answer == n) {
				answer = i;
              			break;
			}else if (answer > n) {
				answer = i - 1;
				break;
			}
		}
        
        return answer;
    }
}
