class Solution {
    public int solution(int n) {
        int countOne = Integer.bitCount(n);
        for (int i = n + 1; ; i++) {
            if (Integer.bitCount(i) == countOne) {
                return i;
            }
        }
    }
}