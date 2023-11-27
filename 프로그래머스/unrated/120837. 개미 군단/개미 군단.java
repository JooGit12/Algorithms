class Solution {
    public int solution(int hp) {
        int generals = hp / 5;
        int soldiers = (hp % 5) / 3;
        int workers = (hp % 5) % 3;

        return generals + soldiers + workers;
    }
}
