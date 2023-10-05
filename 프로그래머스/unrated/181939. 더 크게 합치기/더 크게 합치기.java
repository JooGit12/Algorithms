class Solution {
    public int solution(int a, int b) {
        String aabb = String.valueOf(a) + String.valueOf(b);
        String bbaa = String.valueOf(b) + String.valueOf(a);
        
        int result1 = Integer.parseInt(aabb);
        int result2 = Integer.parseInt(bbaa);
        
        return Math.max(result1, result2);
    }
}