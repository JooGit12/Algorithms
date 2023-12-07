class Solution {
    public int solution(int chicken) {
        int service = 0;
        int freeChicken = 0;
        
        while (chicken >= 10) {
        	freeChicken = chicken / 10;
        	service += freeChicken;
        	chicken = freeChicken + chicken % 10;
		}

        return service;
    }
}
