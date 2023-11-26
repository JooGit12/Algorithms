import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] arr) {
        String answer = "";

        for(int i: arr) {
            answer += (String.valueOf(i)+",").repeat(i);
        }
        return Stream.of(answer.split(",")).mapToInt(Integer::parseInt).toArray(); 
    }
}

