class Solution {
    public int solution(String my_string) {
        String[] strArr = my_string.split(" ");
        int answer = Integer.parseInt(strArr[0]);
        
        for (int i = 1; i < strArr.length; i += 2) {
            if (strArr[i].equals("+")) {
                answer += Integer.parseInt(strArr[i + 1]);
            } else if (strArr[i].equals("-")) {
                answer -= Integer.parseInt(strArr[i + 1]);
            }
        }
        
        return answer;
    }
}
