class Solution {
    public int[] solution(int[] numbers, String direction) {
    	int numSize = numbers.length - 1;
    	int[] answer = new int[numSize + 1];
        
        if (direction.equals("right")) {
        	for (int i = 0; i < numSize; i++) {
				answer[i + 1] = numbers[i];
			}
        	answer[0] = numbers[numSize];
		} else {
			for (int i = 0; i < numSize; i++) {
				answer[i] = numbers[i + 1];
			}
			answer[numSize] = numbers[0];
		}
        return answer;
    }
}
