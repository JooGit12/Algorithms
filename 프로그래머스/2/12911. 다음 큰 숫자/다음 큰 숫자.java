class Solution {
    public int solution(int n) {
    	// 비트 연산자 사용
    	int countOne = Integer.bitCount(n); // n을 2진수로 변환 후 1의 개수 반환
        for (int i = n + 1; ; i++) {
            if (Integer.bitCount(i) == countOne) {
                return i;
            }
        }
    }
}