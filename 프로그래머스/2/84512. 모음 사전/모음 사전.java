class Solution {
    public int solution(String word) {
        char[] alphabets = {'A', 'E', 'I', 'O', 'U'};
        int[] weights = {781, 156, 31, 6, 1};
        int res = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int n = indexOf(alphabets, c);
            res += n * weights[i] + 1;
        }
        
        return res;
    }
    
    private int indexOf(char[] array, char key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
