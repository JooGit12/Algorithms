class Solution {
    public long solution(int balls, int share) {
        long answer = 1;

        int NM = balls - share;
        
        for (int i = 1; i <= NM; i++) {
            answer *= balls--;
            answer /= i;
        }

        return answer;
    }
}
