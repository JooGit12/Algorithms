class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int gcd = 0;
        int bigger = Math.max(denom1, denom2);
        int smaller = Math.min(denom1, denom2);

        while (smaller != 0) {
            gcd = smaller;
            smaller = bigger % smaller;
            bigger = gcd;
        }

        answer[1] = denom1 * denom2 / gcd;
        answer[0] = numer1 * (answer[1] / denom1) + numer2 * (answer[1] / denom2);

        int num = answer[0];
        int den = answer[1];
        while (den != 0) {
            gcd = den;
            den = num % den;
            num = gcd;
        }

        answer[0] /= gcd;
        answer[1] /= gcd;

        return answer;
    }
}