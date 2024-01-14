class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while(count < n) {
            answer++;
            if(isNotContainsThree(answer) && answer % 3 != 0) count++;
        }
        return answer;
    }
    
    private boolean isNotContainsThree(int n) {
        while(n > 0) {
            int digit = n % 10;
            if (digit == 3) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}