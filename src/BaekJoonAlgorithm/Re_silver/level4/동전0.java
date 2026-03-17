package BaekJoonAlgorithm.Re_silver.level4;

import java.io.*;
import java.util.*;

public class 동전0 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];
        for(int i = 0; i<n;i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coin);

        int ans = 0;
        for(int i = n-1; i>=0;i--){
            if(coin[i] <= k){
                ans += k / coin[i];
                k = k % coin[i];
            }

        }

        System.out.println(ans);
    }
}
