import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<List<Integer>> graph;
    static int N;
    static int M;
    static boolean[] visited;
    
    public static void dfs(int node) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NM = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(NM.nextToken());
        M = Integer.parseInt(NM.nextToken());

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer line = new StringTokenizer(reader.readLine());
            int nodeA = Integer.parseInt(line.nextToken());
            int nodeB = Integer.parseInt(line.nextToken());
            graph.get(nodeA).add(nodeB);
            graph.get(nodeB).add(nodeA);
        }
        
        visited = new boolean[N + 1];
        
        int count = 0;
        
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        
        System.out.print(count);
        reader.close();
    }
}
