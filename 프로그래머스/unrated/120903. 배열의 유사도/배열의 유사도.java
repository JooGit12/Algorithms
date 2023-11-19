import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> set = new HashSet<>();
        int answer = 0;

        for (String str : s2) {
            set.add(str);
        }

        for (String str : s1) {
            if (set.contains(str)) {
                answer++;
            }
        }

        return answer;
    }
}
