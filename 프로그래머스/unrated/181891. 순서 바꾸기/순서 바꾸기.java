class Solution {
    public int[] solution(int[] num_list, int n) {
    	int[] answer = new int[num_list.length];
    	int count = 0;
    	
    	for (int i = n; i < num_list.length; i++) {
			answer[count++] = num_list[i];
		}
    	
    	for (int i = 0; i < n; i++) {
    		answer[count++] = num_list[i];
		}
    	
    	return answer;
    }
}
