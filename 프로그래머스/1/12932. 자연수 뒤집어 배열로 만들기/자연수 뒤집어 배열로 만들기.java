import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(long n) {
        
    	ArrayList<Integer> arr = new ArrayList<>();
        
        while (n > 0) {
			arr.add((int)(n % 10));
			n /= 10;
		}
        
        return arr;
    }
}
