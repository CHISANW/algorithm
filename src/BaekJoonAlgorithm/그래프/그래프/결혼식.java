package BaekJoonAlgorithm.그래프.그래프;

import java.util.*;

public class 결혼식 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int n, m;
    static Set<Integer> answer = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int friend : graph[1]) {
            if (!visited[friend]) {
                answer.add(friend);
                visited[friend] = true;
            }
        }

        for (int friend : graph[1]) {
            for (int friendsFriend : graph[friend]) {
                if (!visited[friendsFriend] && friendsFriend != 1) {
                    answer.add(friendsFriend);
                }
            }
        }

        System.out.println(answer.size());
    }
}