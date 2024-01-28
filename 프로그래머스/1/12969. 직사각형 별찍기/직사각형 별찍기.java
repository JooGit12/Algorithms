import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Solution {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] input = br.readLine().split(" ");
            int rowLength = Integer.parseInt(input[0]);
            int columnLength = Integer.parseInt(input[1]);

            Solution solution39 = new Solution();
            solution39.makeStar(rowLength, columnLength, bw);

            bw.flush();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                System.out.println("IOException");
            }
        }
    }

    public void makeStar(int rowLength, int columnLength, BufferedWriter bw) throws IOException {
        String rowStar = "*".repeat(rowLength);
        for (int i = 0; i < columnLength; i++) {
            bw.write(rowStar);
            bw.newLine();
        }
    }
}
