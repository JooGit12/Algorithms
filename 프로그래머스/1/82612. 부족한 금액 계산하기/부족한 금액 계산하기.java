class Solution {
    public long solution(int price, int money, int count) {
        
        long realPrice = 0;
        
        for (int i = 1; i <= count; i++) {
        	realPrice += price * i;
		}
        
        return ((money - realPrice) <= 0) ? (long)Math.abs(money - realPrice) : 0;
    }
}
