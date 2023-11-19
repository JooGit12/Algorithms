class Solution {
    public int solution(int n) {
    	int pizza = 1;
    	if (n <= 7) {
    		return pizza;
		}
    	
    	if (n % 7 != 0) {
			return pizza * n / 7 + 1;
		}
    	
    	return n / 7;
    }
}
