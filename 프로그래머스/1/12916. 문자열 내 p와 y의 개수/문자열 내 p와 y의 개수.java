class Solution {
    boolean solution(String s) {
    	
    	s = s.toLowerCase();
    	
        int pCount = 0;
        int yCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	pCount += (c == 'p') ? 1 : 0;
        	yCount += (c == 'y') ? 1 : 0;
		}

        return pCount == yCount ? true : false;
    }
}
