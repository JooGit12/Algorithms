public class Solution {
	public int solution(int n) {
		return getRepeats(n);
	}
	
	public int getRepeats(int n) {
		if (n == 1) {
			return 1;
		}
		
		return (n % 2 == 0) ? getRepeats(n / 2) : getRepeats((n - 1) / 2) + 1;
	}
}
