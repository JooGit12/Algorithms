class Solution {
    public int[] solution(int[] num_list) {
    	int even = 0;
    	
        for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) even++;
		}

        int[] answer = {even, num_list.length - even};

        return answer;
    }
}
