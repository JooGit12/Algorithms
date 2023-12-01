class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String sum = "";
        
        for (int l = i; l <= j; l++) {
        	sum += l;
		}
        
        for (int l = 0; l < sum.length(); l++) {
			if (sum.charAt(l) == k + 48) answer++;
		}
        
        return answer;
    }
}
