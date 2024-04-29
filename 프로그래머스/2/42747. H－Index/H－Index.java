import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int citationsLen = citations.length;
        
        for (int i = 0; i < citationsLen; i++) {
            int hIndex = citationsLen - i;
            if (citations[i] >= hIndex) return hIndex;
        }
        
        return 0;
    }
}
