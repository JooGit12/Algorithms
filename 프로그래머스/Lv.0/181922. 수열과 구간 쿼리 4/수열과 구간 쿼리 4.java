class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            isMultipleIndex(arr, query[0], query[1], query[2]);
        }
        return arr;
    }
    
    private void isMultipleIndex(int[] arr, int start, int end, int divisor) {
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                arr[i]++;
            }
        }
    }
}
