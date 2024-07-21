package BaekJoonAlgorithm.그래프.그래프;

import java.util.*;

public class 케벤베이컨의6단계법칙 {
    static int[] visited;
    static List<Integer>[] graph;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 전역 변수 n을 초기화
        int m = sc.nextInt();

        graph = new ArrayList[n+1];
        visited = new int[n+1];
        for(int i = 1; i <= n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++){ // m번 반복해야 함
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        solution();
    }

    static void solution(){
        int min = Integer.MAX_VALUE, minIndex = 0;
        for(int i = 1; i <= n; i++){
            int cnt = bfs(i);
            if(min > cnt){
                min = cnt;
                minIndex = i;
            }
        }
        System.out.println(minIndex);
    }

    static int bfs(int start){
        Arrays.fill(visited, -1);
        int cnt = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = 0;

        while (!q.isEmpty()){
            Integer now = q.poll();
            for(int i : graph[now]){
                if(visited[i] != -1) continue;
                visited[i] = visited[now] + 1;
                cnt += visited[i];
                q.add(i);
            }
        }
        return cnt;
    }
}