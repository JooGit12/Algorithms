class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int index = section[0];
        
        for(int i : section) {
            if(index + m - 1 < i) {
                index = i;
                answer++;                
            }
        }
        return answer;
    }
}
