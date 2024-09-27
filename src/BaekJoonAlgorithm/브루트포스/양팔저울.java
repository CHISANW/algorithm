package BaekJoonAlgorithm.브루트포스;

import java.io.*;
import java.util.*;

public class 양팔저울 {
    static int sum, n;
    static int[] arr;
    static boolean[] check;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        sum = 0;

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        check = new boolean[sum + 1];

        dfs(0,0);

        int count = 0;
        for (boolean b : check) {
            if(!b) count++;
        }

        System.out.println(count);
    }

    static void dfs(int depth, int value) {
        if (depth == n){
            if (value >= 0 && value <= sum)
                check[value] = true;
            return ;
        }

        dfs(depth+1, value);
        dfs(depth+1, value+ arr[depth]);
        dfs(depth+1,value-arr[depth]);

    }
}
