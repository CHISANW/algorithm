package programmers.그리디;

import java.util.*;

public class 깊이우선탐색 {

    public static void main(String[] args) {
        int[][] graph1 = {{1,2},{1,3},{2,4},{2,5},{3,6},{5,6}};
        int start1 = 1;
        int n1 = 6;

        System.out.println(Arrays.toString(solution(graph1,start1,n1)));        // {1,2,4,5,6,3}
    }

    static List<Integer>[] tree;
    static List<Integer> ans;
    static boolean[] visited;
    static int[] solution(int[][] graph, int start ,int n){

        tree = new ArrayList[n+1];

        for(int i = 0;i<tree.length;i++){
            tree[i] = new ArrayList<>();
        }

        for(int[] node : graph){
            tree[node[0]].add(node[1]);
        }

        ans = new ArrayList<>();

        visited = new boolean[n+1];

        bfs(start);

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    static void bfs(int start){
        //base case
        visited[start] = true;
        ans.add(start);

        //recursive case
        for(int next : tree[start])
            if(!visited[next])
                bfs(next);
    }


}
