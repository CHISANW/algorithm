package BaekJoonAlgorithm.백트래킹;

import java.util.Arrays;
import java.util.Scanner;

public class N과M10 {
    static int[] arr, printArr;
    static int n , m;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        printArr = new int[m];
        visited = new boolean[n];
        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        dfs(0,0);
        System.out.println(sb);
    }

    static void dfs(int start ,int depth){
        if (depth == m){
            for (int i : printArr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        int check = -1;
        for (int i = start; i<n;i++){
            int now = arr[i];
            if (now == check|| visited[i]) continue;
            check = now;
            visited[i] = true;
            printArr[depth] = arr[i];
            dfs(i+1,depth+1);
            visited[i] = false;
        }
    }
}
