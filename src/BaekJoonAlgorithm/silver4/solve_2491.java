package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solve_2491 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];

        int increase = 1;
        int decrease = 1;
        int answer = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            dp[i] = Integer.parseInt(st.nextToken());
        }

        if(n == 1){
            System.out.println(1);
            return;
        }

       for(int i = 1; i<n;i++){
           if(dp[i] >= dp[i-1]){
               increase++;
           }else{
               increase = 1;
           }

           if(dp[i] <= dp[i-1]){
               decrease++;
           }else{
               decrease = 1;
           }

           answer = Math.max(answer , Math.max(increase, decrease));
       }
        System.out.println(answer);
    }
}
