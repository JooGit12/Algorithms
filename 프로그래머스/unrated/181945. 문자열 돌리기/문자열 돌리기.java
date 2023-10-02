import java.util.Scanner;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = a.length();
        
        if (b >= 1 && b <= 10) {
        	for (int i = 0; i < b; i++) {
        		System.out.println(a.charAt(i));
        	}			
		}
    }
}
