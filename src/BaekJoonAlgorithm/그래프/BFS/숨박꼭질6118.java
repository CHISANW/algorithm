package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 숨박꼭질6118 {
    static List<Integer>[] graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n+1];
        for (int i =0; i<=n; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i =0; i<m;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            graph[start].add(end);
            graph[end].add(start);
        }


        int[] dist = new int[n+1];
        Arrays.fill(dist, -1);
        dist[1] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);

        while (!q.isEmpty()){
            Integer now = q.poll();

            for (Integer next : graph[now]) {
                if (dist[next]== -1){
                    dist[next] =dist[now]+1;
                    q.add(next);
                }
            }
        }
        
        int maxDist = 0;  // 가장 먼 거리 값
        int value = 0;  // 헛간 번호
        int count = 0;  // 같은 값

        for (int i =1;i<=n;i++){
            if (dist[i] > maxDist){
                maxDist = dist[i];
                value = i;
                count = 1;
            }else if (dist[i] == maxDist){
                count++;
                value = Math.min(value,i);
            }
        }

        System.out.println(value +" "+maxDist+" "+count);
    }
}
