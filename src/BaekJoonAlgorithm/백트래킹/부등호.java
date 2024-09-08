package BaekJoonAlgorithm.백트래킹;

import java.io.*;
import java.util.*;

public class 부등호 {
    static int n;
    static boolean[] visited;
    static String[] arr;
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");

        visited = new boolean[10];

        dfs("", 0);

        // 정렬을 통해 최솟값과 최댓값 구하기
        Collections.sort(list);

        System.out.println(list.get(list.size() - 1)); // 최댓값
        System.out.println(list.get(0)); // 최솟값
    }

    static void dfs(String num, int idx) {
        if (idx == n + 1) {
            list.add(num);
            return;
        }

        for (int j = 0; j < 10; j++) {
            if (visited[j]) continue;

            if (idx == 0 || check(num.charAt(idx - 1) - '0', j, arr[idx - 1])) {
                visited[j] = true;
                dfs(num + j, idx + 1);
                visited[j] = false;
            }
        }
    }

    static boolean check(int a, int b, String c) {
        if (c.equals(">")) {
            if (a < b) return false;
        } else if (c.equals("<")) {
            if (a > b) return false;
        }
        return true;
    }
}
