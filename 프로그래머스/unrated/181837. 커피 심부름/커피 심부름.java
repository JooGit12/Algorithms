class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (int i = 0; i < order.length; i++) {
			answer += order[i].contains("latte") ? 5000 : 4500; 
		}
        
        return answer;
    }
}
