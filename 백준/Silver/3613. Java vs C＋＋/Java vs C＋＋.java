import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        System.out.println(makeCorrectVariable(input));
        reader.close();
    }
    
    private static String makeCorrectVariable(String input) {
        if (input.indexOf('_') == 0 || input.indexOf('_') == input.length() - 1 || input.contains("__") || Character.isUpperCase(input.charAt(0))) {
            return "Error!";
        }
        
        boolean hasUnderscore = input.indexOf('_') > -1;
        boolean hasUpperCase = !input.equals(input.toLowerCase());
        
        if (hasUnderscore && hasUpperCase) {
            return "Error!";
        } else if (hasUnderscore) {
            return makeCamelCase(input);
        } else if (hasUpperCase) {
            return makeSnakeCase(input);
        } else {
            return input;
        }
    }    
    
    private static String makeSnakeCase(String camelStr) {
        StringBuilder builder = new StringBuilder();
        for (char c : camelStr.toCharArray()) {
            builder.append((Character.isLowerCase(c)) ? c : "_" + Character.toLowerCase(c));
        }
        return builder.toString();
    }
    
    private static String makeCamelCase(String snakeStr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < snakeStr.length(); i++) {
            if (snakeStr.charAt(i) == '_') {
                if (i + 1 < snakeStr.length()) {
                    builder.append(Character.toUpperCase(snakeStr.charAt(i + 1)));
                    i++;
                } else {
                    return "Error!";
                }
            } else {
                builder.append(snakeStr.charAt(i));
            }
        }
        return builder.toString();
    }
}
