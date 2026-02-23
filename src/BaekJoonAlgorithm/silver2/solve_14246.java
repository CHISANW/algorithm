package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_14246 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long k = Long.parseLong(br.readLine());

        long ans = 0;
        long sum =0;
        int right = 0;

        for(int i = 0; i<n;i++){
            while (right < n && sum + arr[right] <= k){
                sum += arr[right];
                right++;
            }

            if(right < n){
                System.out.println(right);
                ans += (n - right);
            }

            sum -= arr[i];
        }
        System.out.println(ans);


    }
}
