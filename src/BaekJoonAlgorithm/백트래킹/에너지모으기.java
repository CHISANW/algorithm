package BaekJoonAlgorithm.백트래킹;

import java.io.*;
import java.util.*;

public class 에너지모으기 {
    static int n;
    static long ans;
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visited = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for (int i =0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,0);

        System.out.println(ans);
    }

    static void dfs(int depth, long sum){
        if (depth== n-2){
            ans = Math.max(ans,sum);
            return;
        }

        for (int i =1; i< n - 1;i++){
            if (visited[i]) continue;

            int left = i, right = i;
            while (left-- > 0){
                if (!visited[left]) break;
            }

            while (right++ < n-1){
                if (!visited[right]) break;;
            }

            visited[i] = true;
            dfs(depth+1,sum + (arr[left] * arr[right]));
            visited[i] = false;
        }
    }
}
