public class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int countedDivisor = countDivisors(i);
            answer += (limit < countedDivisor) ? power : countedDivisor;
        }
        
        return answer;
    }
    
    private static int countDivisors(int n) {
        int count = 0;
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) count = (n / i == i) ? count + 1 : count + 2;
        }
        
        return count;
    }
}
