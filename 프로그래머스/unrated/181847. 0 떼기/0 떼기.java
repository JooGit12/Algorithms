class Solution {
    public String solution(String n_str) {
        int start = 0;
        
        if (!n_str.startsWith("0")) {
			return n_str;
		}else {
			for (int i = 0; i < n_str.length(); i++) {
				if (n_str.charAt(i) != '0') {
					start = i;
					break;
				}
			}			
			return n_str.substring(start);
		}
        
    }
}
