package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class solve_14248 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s = Integer.parseInt(br.readLine()) - 1;

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(s);
        visited[s] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            int jump = arr[cur];

            int nex1 = cur + jump;
            int next2 = cur - jump;

            if (nex1>=0 && nex1 < n  && !visited[nex1]) {
                visited[nex1] = true;
                q.add(nex1);
            }

            if (next2 >= 0 && next2 < n && !visited[next2]) {
                visited[next2] = true;
                q.add(next2);
            }
        }

        int count = 0;
        for (boolean v : visited) {
            if (v) count++;
        }

        System.out.println(count);
    }
}
