class Solution {
    public int[] solution(int brown, int yellow) {
        double d = Math.sqrt((brown + 4) / 2.0 * (brown + 4) / 2.0 - 4 * (brown + yellow));
        int weight = (int)(((brown + 4) / 2.0 + d) / 2);
        int height = (int)(((brown + 4) / 2.0 - d) / 2);
        
        return new int[] {weight, height};
    }
}
