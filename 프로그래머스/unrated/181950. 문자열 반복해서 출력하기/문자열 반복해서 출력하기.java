import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        int n = sc.nextInt();
        if (str.length() >= 1 && str.length() <= 10 && n >= 1 && n <= 5) {
            for (int i = 0; i < n; i++) {
                System.out.print(str);
            }
        } else {
            System.out.println("입력값이 너무 큽니다");
        }
    }
}