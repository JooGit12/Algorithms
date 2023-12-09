class Solution {
    public int solution(int[] array, int n) {
        
        int answer = array[0];
        int minDiffer = Math.abs(array[0] - n);
        
        for (int i = 1; i < array.length; i++) {
			int currentDiffer = Math.abs(array[i] - n);
			
			if (currentDiffer < minDiffer || (currentDiffer == minDiffer && array[i] < answer)) {
				minDiffer = currentDiffer;
				answer = array[i];
			}
		}
        
        return answer;
    }
}
