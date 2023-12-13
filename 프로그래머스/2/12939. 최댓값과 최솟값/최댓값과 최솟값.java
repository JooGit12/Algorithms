import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];
        
        for (int i = 0; i < iArr.length; i++) {
			iArr[i] = Integer.parseInt(sArr[i]);
		}
        
        Arrays.sort(iArr);
        
        return iArr[0] + " " + iArr[iArr.length - 1];
    }
}
