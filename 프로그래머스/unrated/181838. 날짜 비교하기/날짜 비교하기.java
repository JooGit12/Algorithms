class Solution {
    public int solution(int[] date1, int[] date2) {
        
    	int dateSum1 = Integer.parseInt((date1[0] + "") + (date1[1] + "") + (date1[2] + "")); 
    	int dateSum2 = Integer.parseInt((date2[0] + "") + (date2[1] + "") + (date2[2] + ""));
    	
    	return (dateSum2 > dateSum1) ? 1 : 0;
    }
}
