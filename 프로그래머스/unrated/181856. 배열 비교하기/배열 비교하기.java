class Solution {
	public int solution(int[] arr1, int[] arr2) {
		
		int sum = 0;
		
		if (arr1.length > arr2.length) {
			return 1;
		}else if (arr2.length > arr1.length) {
			return -1;
		}else {
			for (int i = 0; i < arr1.length; i++) {
				sum += arr1[i];
			}
			for (int i = 0; i < arr2.length; i++) {
				sum -= arr2[i];
			}
		}
		
		if (sum == 0) {
			return 0;
		}
		
		return sum > 0 ? 1 : -1;
		
	}
}
