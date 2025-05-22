package ReSolve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1260 {
    static int n , m, v;
    static int[][] graph;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();

        graph = new int[n+1][n+1];
        check = new boolean[n+1];

        for (int i =0; i<m;i++){
            int src = sc.nextInt();
            int dist = sc.nextInt();

            graph[src][dist] = 1;
            graph[dist][src] = 1;
        }

        DFS(v);
        check = new boolean[n+1];
        System.out.println();
        BFS(v);
    }

    static void DFS(int node){
        check[node] = true;
        System.out.print(node +" ");
        for (int i = 1; i<=n;i++){
            if(!check[i] && graph[node][i] == 1){
                DFS(i);
            }
        }

    }

    static Queue<Integer> queue;
    static void BFS(int node){
        queue = new LinkedList<>();
        check[node] = true;
        queue.add(node);

        while (!queue.isEmpty()){
            Integer now = queue.poll();
            System.out.print(now+" ");
            for (int i =1; i<=n;i++){
                if (!check[i] && graph[now][i]==1){
                    queue.offer(i);
                    check[i] = true;
                }
            }
        }


    }
}
