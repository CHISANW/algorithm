package programmers.그리디;

import java.util.*;

public class 너비우선탐색순회 {
    public static void main(String[] args) {
        int[][] graph = {{1,2},{1,3},{2,4},{2,5},{3,6},{3,7},{4,8},{5,8},{6,9},{7,9}};
        int start = 1;
        int n = 9;

        System.out.println(Arrays.toString(solution(graph,start,n)));

    }

    static List<Integer>[] tree;
    static boolean[] visited;
    static List<Integer> ans;
    static int[] solution(int[][] graph, int start , int n){

        tree = new ArrayList[n+1];
        visited = new boolean[n+1];
        ans = new ArrayList<>();

        for(int i =0;i<tree.length;i++){
            tree[i] = new ArrayList<>();
        }

        for(int[] node : graph){
            tree[node[0]].add(node[1]);
        }

        bfs(start);

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    static void bfs(int start){

        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        visited[start] = true;

        while(!q.isEmpty()){
            int now = q.poll();
            ans.add(now);

            for(int next : tree[now]){
                if(!visited[next]){
                    q.add(next);
                    visited[next]=true;
                }
            }
        }
    }
}
