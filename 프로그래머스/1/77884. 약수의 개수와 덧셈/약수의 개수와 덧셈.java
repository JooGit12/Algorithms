class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // 약수의 계수가 홀수면 answer에서 빼고 짝수면 더한다.
        for (int i = left; i <= right; i++) {
            int divisorCount = countDivisors(i);

            if (divisorCount % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }
    
    // 약수의 개수를 구해주는 메소드
    private int countDivisors(int num) {
        int divisorCount = 0;

        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                divisorCount++;
            }
        }

        return divisorCount;
    }
}
