package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_13305 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] distance = new long[n];
        long[] gas = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n-1;i++){
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            gas[i] = Integer.parseInt(st.nextToken());
        }

        long min = gas[0];
        long ans = gas[0] * distance[0];

        for(int i =1 ;i<n-1;i++){
            min = Math.min(gas[i], min);
            ans += min * distance[i];
        }
        System.out.println(ans);

    }
}
