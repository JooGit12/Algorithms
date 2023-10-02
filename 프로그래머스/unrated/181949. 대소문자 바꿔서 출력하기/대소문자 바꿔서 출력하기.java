
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for (char c : str.toCharArray()) {
        	if (Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			} else {
				result += Character.toUpperCase(c);
			}
		}
        System.out.println(result);
	}
}
