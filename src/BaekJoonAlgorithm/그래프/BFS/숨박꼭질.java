package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 숨박꼭질 {
    static int[] visited = new int[100001];
    static int n, k;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visited[n] = 1;
        while(!q.isEmpty()){
            int now = q.poll();
            if(now == k) break;
            int[] next = {now - 1, now + 1, 2*now};
            for(int i=0;i<3;i++){
                if(!isRange(next[i])) continue;
                if(visited[next[i]] == 0){
                    visited[next[i]] = visited[now] + 1;
                    q.add(next[i]);
                }
            }
        }
        System.out.println(visited[k]-1);

    }
    static boolean isRange(int x){
        return x>=0 && x<=100000;
    }
}
