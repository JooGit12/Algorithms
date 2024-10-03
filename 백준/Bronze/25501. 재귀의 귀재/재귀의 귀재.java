import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count;
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        
        int N = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < N; i++) {
            String word = reader.readLine();
            builder.append(isPalindrome(word)).append(' ').append(count).append("\n");
            count = 0;
        }
        
        System.out.print(builder.toString());
        reader.close();
    }
    
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
