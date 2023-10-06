class Solution {
    public int solution(int n) {
    	int evenSum = 0;
        if (n % 2 == 1) {
			return (n + 1) * (n + 1) / 4;
		} else {
			for (int i = 2; i <= n; i+= 2) {
				evenSum += i * i;
			}
			return evenSum;
		}
    }
}
