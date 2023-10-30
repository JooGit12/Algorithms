class Solution {
    public String solution(String myString, int s, int e) {
        return myString.substring(0, s) + new StringBuilder(myString.substring(s, e + 1)).reverse().toString() + myString.substring(e + 1);
    }
}
