package BaekJoonAlgorithm.그래프;

import java.util.*;

public class DFS와BFS {
    static int n, m ,v;
    static int[][] graph;
    static boolean[] check;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        v = sc.nextInt();
        
        graph = new int[n+1][n+1];
        check = new boolean[n+1];
        
        //무방향 그래프 이므로 양쪽에 데이터를 넣어줘야함
        for(int i =0;i<m;i++){
            int src = sc.nextInt();
            int dist = sc.nextInt();
            
            graph[src][dist] = 1;
            graph[dist][src] = 1;
        }

        DFS(v);
        System.out.println();
        check = new boolean[n+1]; //빈 배열로 초기화
        BFS(v);
    }
    
    //깊이 우선 탐색(DFS)
    static void DFS(int node){
        check[node] =true;
        System.out.print(node+" ");

        for(int i =1;i<=n;i++){
            if(!check[i] && graph[node][i] == 1){
                DFS(i);
            }
        }
    }

    static Queue<Integer> queue;
    //넢이 우선 탐색
    static void BFS(int node){
        queue = new LinkedList<>();
        check[node] = true;
        queue.add(node);

        while(!queue.isEmpty()){
            int now = queue.poll();
            System.out.print(now+" ");
            for(int i =1;i<=n;i++){
                if(!check[i] && graph[now][i] == 1){
                    queue.offer(i);
                    check[i] = true;
                }
            }
        }

    }


}
