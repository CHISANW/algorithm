package BaekJoonAlgorithm.그래프.플로이드워셜;

import java.util.*;

public class SmallWorldNetwork {
    static final int INF = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] graph = new int[N+1][N+1];
        for (int i = 1; i<=N; i++){
            Arrays.fill(graph[i],INF);
            graph[i][i] = 0;
        }

        for (int i = 0; i<K;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        for (int k = 1; k<=N;k++){
            for (int i = 1; i<=N;i++){
                for (int j = 1; j<=N;j++){
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }

        boolean check = true;
        for (int i = 1; i<=N;i++){
            for (int j = 1; j<=N;j++){
                if (i !=j && graph[i][j] >6){
                    check = false;
                    break;
                }
            }
            if (!check) break;
        }

        System.out.println(check ? "Small World!" : "Big World!");
    }
}
