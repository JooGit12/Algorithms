import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
    	ArrayList<Long> ar = new ArrayList<>();
    	StringBuilder sb = new StringBuilder();
    	
    	while (true) {
    		ar.add(n % 10);
    		if (n < 10) {
				break;
			}
    		n = n / 10;
		}
    	
    	Collections.sort(ar);
    	
    	for (int i = 0; i < ar.size(); i++) {
			sb.append(ar.get(i));
		}
    	
    	return Long.parseLong(sb.reverse().toString());
    }
}
