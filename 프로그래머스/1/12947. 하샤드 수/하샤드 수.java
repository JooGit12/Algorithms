class Solution {
    public boolean solution(int x) {
    	
        String xToString = Integer.toString(x);
        int hashard = 0;
        
        for (int i = 0; i < xToString.length(); i++) {
			hashard += Character.getNumericValue(xToString.charAt(i));
		}
        
        return x % hashard == 0;
    }
}
