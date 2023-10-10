class Solution {
    public int solution(int n, String control) {
        StringBuilder sb = new StringBuilder(control);
        for (int i = 0; i < control.length(); i++) {
        	char c = sb.charAt(i);
			if (c == 'w') {
				n += 1;
			} else if (c == 's'){
				n -= 1;
			} else if (c == 'd') {
				n += 10;
			} else {
				n -= 10;
			}
		}
        return n;
    }
}
