package BaekJoonAlgorithm.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 문제번호 11724번 DFS(깊이 우선 탐색)
 * 해당 문제에서 예상 데이터의 값은 10만건이므로 3초이내에 풀수있기때문에 시간 복잡도가 최악인경우로 풀어도 가능하기떄무에 시간복잡도가 O(V+E)인 DFS로 문제 풀이
 * 재귀 함수로 풀이
 */
public class 연결_요소의_개수 {
    static boolean[] visited;
    static ArrayList<Integer>[] arrayLists;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited= new boolean[n+1];
        arrayLists = new ArrayList[n+1];

        for (int i =1;i<n+1;i++){
            arrayLists[i] = new ArrayList<>();
        }

        for (int i =0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arrayLists[s].add(e);
            arrayLists[e].add(s);
        }
        int count = 0;

        for (int i =1;i<n+1;i++){
            if (!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);

    }

    private static void DFS(int v) {
        if (visited[v]) return;

        visited[v] =true;
        for (int i : arrayLists[v]){
            if (!visited[i])
                DFS(i);
        }
    }
}
