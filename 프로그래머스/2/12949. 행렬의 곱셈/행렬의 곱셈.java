import java.util.Arrays;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        /**
         * 곱셈의 결과로 나오는 행렬의 크기는
         * 두 행렬의 크기가 같아야하며
         * 첫 번째 행렬의 행의 수와 두 번째 행렬의 열의 수를 기반으로 한다.
         */
        int answerRows = arr1.length;
        int answerColumns = arr2[0].length;
        
        int[][] answer = new int[answerRows][answerColumns];
        
        for (int i = 0; i < answerRows; i++) {
            for (int j = 0; j < answerColumns; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] result = s.solution(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}});
        System.out.println(Arrays.deepToString(result));
    }
}
