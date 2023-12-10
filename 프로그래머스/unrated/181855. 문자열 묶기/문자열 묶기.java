class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        int[] lengArr = new int[31];

        for(int i=0; i<strArr.length; i++) {
            lengArr[strArr[i].length()]++;
        }

        for(int i=0; i<=30; i++) {
            answer = Math.max(answer, lengArr[i]);
        }

        return answer;
    }
}
