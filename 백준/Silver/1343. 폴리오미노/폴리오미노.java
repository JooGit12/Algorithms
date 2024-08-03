import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String board = reader.readLine();
        System.out.print(fillPolymino(board));
        reader.close();
    }

    private static String fillPolymino(String board) {
        StringBuilder builder = new StringBuilder();
        int index = 0;
        int boardLen = board.length();

        while (index < boardLen) {
            if (board.charAt(index) == 'X') {
                int countX = 0;

                while (index < boardLen && board.charAt(index) == 'X') {
                    countX++;
                    index++;
                }

                if (countX % 2 != 0) {
                    return "-1";
                }

                int countAAAA = countX / 4;
                int countBB = (countX % 4) / 2;

                for (int i = 0; i < countAAAA; i++) {
                    builder.append("AAAA");
                }
                for (int i = 0; i < countBB; i++) {
                    builder.append("BB");
                }
            } else {
                builder.append(board.charAt(index));
                index++;
            }
        }

        return builder.toString();
    }
}
