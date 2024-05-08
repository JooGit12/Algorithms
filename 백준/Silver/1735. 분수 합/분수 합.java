import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] fraction1 = reader.readLine().split(" ");
        String[] fraction2 = reader.readLine().split(" ");
        
        int numerator1 = Integer.parseInt(fraction1[0]);
        int numerator2 = Integer.parseInt(fraction2[0]);
        int denominator1 = Integer.parseInt(fraction1[1]);
        int denominator2 = Integer.parseInt(fraction2[1]);
        
        System.out.println(sumFraction(numerator1, numerator2, denominator1, denominator2));
        reader.close();
    }
    
    private static String sumFraction(int numerator1, int numerator2, int denominator1, int denominator2) {
        int newDenominator = getLCM(denominator1, denominator2);
        int newNumerator = (newDenominator / denominator1) * numerator1 + (newDenominator / denominator2) * numerator2;
        int gcd = getGCD(newNumerator, newDenominator);
        return (newNumerator / gcd) + " " + (newDenominator / gcd);
    }
    
    private static int getLCM(int a, int b) {
        return (a * b) / getGCD(a, b);
    }
    
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;            
        }
        return a;
    }
}
