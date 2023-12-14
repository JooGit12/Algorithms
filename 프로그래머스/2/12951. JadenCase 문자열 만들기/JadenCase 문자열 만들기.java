class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        char prevChar = ' ';
        for (char c : s.toCharArray()) {
            if (prevChar == ' ') {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
            prevChar = c;
        }

        return sb.toString();
    }
}
