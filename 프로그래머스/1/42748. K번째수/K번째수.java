import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
			 int [] cuttedArr = cutArray(array, commands[i][0], commands[i][1]);
			 answer[i] = sortArray(cuttedArr, commands[i][2]);
		}
        
        return answer;
    }
    
    private int sortArray (int array[], int c) {
    	Arrays.sort(array);
    	return array[c - 1];
    }
    
    private int[] cutArray (int array[], int a, int b) {
    	int [] cuttedArr = new int[b - a + 1];
    	for (int i = a - 1, j = 0; i < b; i++, j++) {
			cuttedArr[j] = array[i];
		}
    	return cuttedArr;
    }
}
