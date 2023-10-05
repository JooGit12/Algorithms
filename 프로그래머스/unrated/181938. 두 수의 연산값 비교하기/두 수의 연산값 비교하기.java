class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt("" + a + b);
        int aabb = 2 * a * b;
        answer = ab > aabb ? ab : aabb;
        return answer;
    }
}
