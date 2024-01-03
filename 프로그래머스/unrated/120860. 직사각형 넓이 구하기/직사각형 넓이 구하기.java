import java.util.Arrays;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, (a, b) -> a[0] - b[0]);
        int column = dots[2][0] - dots[0][0];

        Arrays.sort(dots, (a, b) -> a[1] - b[1]);
        int row = dots[2][1] - dots[0][1];

        return Math.abs(row * column);
    }
}