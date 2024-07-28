package BaekJoonAlgorithm.다이크스트라;

import java.util.Scanner;

public class 최소비용구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int INF = 100000000;
        int[][] graph = new int[n+1][n+1];
        boolean[] visited = new boolean[n+1];
        int[] cost = new int[n+1];

        for(int i =1; i<=n;i++){
            cost[i] = INF;
            for(int j =1; j<=n;j++){
                graph[i][j] = INF;
            }
        }

        for(int i =0;i<m;i++){
            int src = sc.nextInt();
            int dist = sc.nextInt();
            int distCost = sc.nextInt();
            if(graph[src][dist] > distCost)
                graph[src][dist] = distCost;
        }

        int start = sc.nextInt();
        int end = sc.nextInt();
        cost[start] = 0;

        for(int i =1; i<=n;i++){
            int min = INF;
            int minIndex = -1;

            for(int j =1; j<=n;j++){
                if(cost[j] < min && !visited[j]){
                    min = cost[j];
                    minIndex = j;
                }
            }

            if(minIndex == -1) break;
            visited[minIndex] = true;
            for(int j =1; j<=n;j++){
                if(cost[j] > cost[minIndex] + graph[minIndex][j])
                    cost[j] = cost[minIndex] + graph[minIndex][j];
            }
        }
        System.out.println(cost[end]);
    }
}
