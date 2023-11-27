class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = (arr[i] >= 50 && arr[i] % 2 == 0) ? arr[i] / 2 :
                        (arr[i] < 50 && arr[i] % 2 != 0) ? arr[i] * 2 :
                        arr[i];
        }

        return answer;
    }
}
