class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rny_string.length(); i++) {
            sb.append(rny_string.charAt(i) == 'm' ? "rn" : rny_string.charAt(i));
        }

        return sb.toString();
    }
}
