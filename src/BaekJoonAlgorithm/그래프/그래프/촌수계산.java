package BaekJoonAlgorithm.그래프.그래프;

import java.util.*;

public class 촌수계산 {
    static List<Integer>[] graph;
    static boolean[] checked;
    static int res = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        graph = new ArrayList[n+1];
        checked = new boolean[n+1];
        for(int i = 1;i<=n;i++){
            graph[i] = new ArrayList<>();
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        int l = sc.nextInt();

        for(int i= 0;i<l;i++){
            int child = sc.nextInt();
            int parent = sc.nextInt();
            graph[child].add(parent);
            graph[parent].add(child);
        }

        dfs(x,y,0);
        System.out.println(res);

    }

    static void dfs(int start, int end, int cnt){
        if (start == end){
            res = cnt;
            return;
        }

        checked[start] =true;
        for (int i =0; i<graph[start].size();i++){
            Integer next = graph[start].get(i);
            if (!checked[next]){
                dfs(next,end, cnt+1);
            }
        }
    }


}
