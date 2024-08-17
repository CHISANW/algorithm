package BaekJoonAlgorithm.그래프.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 특정거리의도시찾기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[n+1];
        for (int i =1 ;i<=n;i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
        }

        int[] distance = new int[n+1];
        Arrays.fill(distance, -1);
        distance[x] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(x);

        while (!q.isEmpty()){
            Integer current = q.poll();

            for (int next : graph[current]){
                if (distance[next]  == -1){
                    distance[next] = distance[current] + 1;
                    q.add(next);
                }
            }
        }

        boolean fond =false;

        for (int i =1;i<=n;i++){
            if (distance[i] == k){
                System.out.println(i);
                fond= true;
            }
        }

        if (!fond){
            System.out.println(-1);
        }

    }
}
