package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class ABCDE {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int n, m;
    static boolean found = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList[n];

        for (int i =0; i<n;i++){
            graph[i] = new ArrayList<>();
        }

        for (int i =0; i<m;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph[start].add(end);
            graph[end].add(start);
        }

        for (int i =0;i<n;i++){
            visited = new boolean[n];
            visited[i]= true;
            dfs(i,1);
            if (found) break;
        }

        if (found) System.out.println(1);
        else System.out.println(0);

    }
    static void dfs(int start,int depth){
        if (depth == 5){
            found =true;
            return;
        }

        for (int next : graph[start]){
            if (!visited[next]){
                visited[next] =true;
                dfs(next,depth+1);
                visited[next]= false;
            }
            if (found) return;
        }

    }
}
