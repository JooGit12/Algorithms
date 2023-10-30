class Solution {
    public String solution(String my_string, int s, int e) {
        return new StringBuilder(my_string.substring(0, s)).append(new StringBuilder(my_string.substring(s, e + 1)).reverse()).append(my_string.substring(e + 1)).toString();
    }
}