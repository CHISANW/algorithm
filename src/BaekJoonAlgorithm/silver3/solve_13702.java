package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_13702 {
    static int n;
    static long k;
    static long[] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Long.parseLong(st.nextToken());

        arr = new long[n];
        long max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(br.readLine());
            if (arr[i] > max) max = arr[i];
        }


        long left = 1, right = max;
        long ans = 0;
        while (left <= right){
            long mid = (left + right)/ 2;

            long supply = supply(mid);
            if(supply >= k){
                left = mid + 1;
                ans = Math.max(ans, mid);
            }else {
                right = mid -1;
            }

        }
        System.out.println(ans);
    }

    static long supply(long value){
        long result = 0;
        for(int i = 0; i<n;i++){
            result += arr[i]/value;
        }
        return result;

    }
}
