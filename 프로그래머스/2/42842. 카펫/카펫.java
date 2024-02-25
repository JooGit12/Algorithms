class Solution {
    public int[] solution(int brown, int yellow) {
        int carpetArea = brown + yellow;        
        int x = 3;
        int y = 3;
        
        for (int i = 3; i <= carpetArea / 2; i++) {
			if (carpetArea % i == 0) {
				x = carpetArea / i;
				y = i;
				if (2 * (x + y) - 4 == brown) break;
			}
		}

        return new int[] {x, y};
    }
}
