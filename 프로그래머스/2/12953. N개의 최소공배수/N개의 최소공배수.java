class Solution {
	public int solution(int[] arr) {
		return findLCMofArr(arr);
	}

	private static int findLCMofArr(int[] arr) {
		int lcm = 1;
		for (int num : arr) {
			lcm = findLCM(lcm, num);
		}
		return lcm;
	}

	private static int findLCM(int a, int b) {
		return (a * b) / findGCD(a, b);
	}

	private static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
}
