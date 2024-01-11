import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[][] indexArr = new int[rank.length][2]; 
        
        for (int i = 0; i < indexArr.length; i++) {
        	if (attendance[i]) {
            	indexArr[i][0] = rank[i]; 
    			indexArr[i][1] = i;
			}else {
				indexArr[i][0] = Integer.MAX_VALUE;
				indexArr[i][1] = i;
			}
		}
        
        Arrays.sort(indexArr, Comparator.comparingInt(a -> a[0]));
        
        return 10000 * indexArr[0][1] + 100 * indexArr[1][1] + indexArr[2][1];
    }
}
