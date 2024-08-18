package BaekJoonAlgorithm.백트래킹;

import java.util.*;

public class N과M11 {
    static int n, m;
    static int[] arr , print;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        m =sc.nextInt();

        arr= new int[n];
        print = new int[m];

        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        dfs(0);
        System.out.println(sb);
    }

    static void dfs( int depth){
        if (depth==m){
            for (int i : print) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        int before = -1;
        for (int i =0;i<n;i++){
            int now = arr[i];

            if (now == before) continue;
            before = now;
            print[depth] = arr[i];
            dfs(depth+1);
        }
    }
}
