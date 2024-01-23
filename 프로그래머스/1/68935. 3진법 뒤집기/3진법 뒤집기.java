class Solution {
    public int solution(int n) {
        StringBuilder reversedSB = new StringBuilder(Integer.toString(n, 3)).reverse();
        return Integer.parseInt(reversedSB.toString(), 3);
    }
}
