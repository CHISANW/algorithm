package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_17827 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st= new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long k;
        int cycleLen = n - (v-1);

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<m;i++){
            k = Long.parseLong(br.readLine());

            if(k < n){
                sb.append(arr[(int)k]).append("\n");
            }else{
                long remind = (k - (v-1)) % cycleLen;
                int index = (v-1) + (int)remind;
                sb.append(arr[index]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
