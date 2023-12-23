class Solution {
    public int[] solution(int[] arr) {
        int firstIdx = 0;
        int EndIdx = 0;
        
        for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				firstIdx = i;
				break;
			}
		}
    	
        for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == 2) {
				EndIdx = i;
				break;
			}
		}
        
        if (firstIdx == 0 && EndIdx == 0) {
            return new int[] {-1};
        }
    	
    	int[] answer = new int[EndIdx - firstIdx + 1];
        
    	for (int i = firstIdx; i <= EndIdx; i++) {
			answer[i - firstIdx] = arr[i];
		}
    	
    	return answer;
    }
}
