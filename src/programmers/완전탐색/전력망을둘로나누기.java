package programmers.완전탐색;

import java.util.ArrayList;

//https://school.programmers.co.kr/learn/courses/30/lessons/86971
public class 전력망을둘로나누기 {
    public static void main(String[] args) {
        int n = 9;
        int[][] wires = {
            {1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}
        };

        System.out.println(solution(n,wires));
    }

    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int N, answer;
    static int solution(int n , int[][] wires){

        N = n;
        answer = n-1;
        tree = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i = 1; i<=n;i++){
            tree[i] = new ArrayList<>();
        }

        for(int[] wire : wires){
            tree[wire[0]].add(wire[1]);
            tree[wire[1]].add(wire[0]);
        }

        bfs(1);

        System.out.println();
        return answer;
    }

    static int bfs(int node){
        visited[node] = true;
        int sum = 0;

      for(int next : tree[node])
          if(!visited[next]){
              int cnt = bfs(next);
              answer = Math.min(answer , Math.abs(N- cnt * 2));
              sum+=cnt;
          }

        return sum + 1;
    }
}
