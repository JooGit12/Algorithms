import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < -100000 || a > 100000) {
            return;
        }
        
        int b = sc.nextInt();
        if (b < -100000 || b > 100000) {
            return;
        }
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);   
    }
}