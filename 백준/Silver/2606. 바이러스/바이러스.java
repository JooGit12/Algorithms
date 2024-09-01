import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int n;
    static int m;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());
        graph = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        answer = 0;
        dfs(1);
        System.out.print(answer - 1);
        reader.close();
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        answer++;
        for (int i = 0; i <= n; i++) {
            if (visited[i] == false && graph[idx][i]) dfs(i);
        }
    }
}
