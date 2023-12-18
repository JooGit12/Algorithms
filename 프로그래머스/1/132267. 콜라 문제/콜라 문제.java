class Solution {
    public int solution(int a, int b, int n) {
        int cokeZero = 0;
        int answer = 0;
        
        while (n >= a) {
			cokeZero = (n / a) * b;
			answer += cokeZero;
			n = (n / a) * b + (n % a);
		}

        return answer;
    }
}
