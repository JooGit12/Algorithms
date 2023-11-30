class Solution {
    public int solution(int n) {
    	return ((6 * n) / getGCD(6, n)) / 6;
    }
    
    private static int getGCD(int a, int b) {
    	while (b != 0) {
    		int temp = b;
    		b = a % b;
    		a = temp;
		}
    	return a;
	}
}
