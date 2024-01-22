class Solution {
    public int solution(int[] sides) {
    	int longgerSide = Math.max(sides[0], sides[1]);
    	int shorterSide = Math.min(sides[0], sides[1]);
    	
        int answer = (longgerSide + shorterSide) - (longgerSide - shorterSide) - 1;
        
        return answer;
    }
}
