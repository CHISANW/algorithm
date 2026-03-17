package BaekJoonAlgorithm.Re_silver.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 바이러스 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        graph = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[n+1];

        int m = sc.nextInt();
        for(int i =0; i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        int count = 0;

        for(int i =2; i<=n;i++){
            if(visited[i]){
                count++;
            }
        }
        System.out.println(count);

    }

    static void dfs(int x){
        visited[x] = true;

        for(int next: graph[x]){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}
