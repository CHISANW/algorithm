package BaekJoonAlgorithm.그래프.플로이드워셜;

import java.io.*;
import java.util.*;

public class 플로이드 {
    static int INF = 100000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] graph = new int[n+1][n+1];
        for (int i =1; i<=n;i++){
            for (int j =1 ;j<=n;j++){
                if (i == j) {
                    graph[i][j] = 0;
                }else
                    graph[i][j] =INF;
            }
        }

        for (int i =0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            if (graph[start][end] > cost){
                graph[start][end] = cost;
            }
        }

        for (int k = 1; k<=n;k++){ // 경유지
            for (int i =1; i<=n;i++){   // 시작점
                for (int j = 1;j<=n;j++){ // 독착점
                    if (graph[i][j] > graph[i][k] + graph[k][j]){
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }

        for (int i =1;i<=n;i++){
            for (int j = 1; j<=n;j++){
                if (graph[i][j] ==INF){
                    sb.append(0).append(" ");
                }else
                    sb.append(graph[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

}
