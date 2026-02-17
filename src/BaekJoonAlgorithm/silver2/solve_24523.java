package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_24523 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =1; i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i = 1;

        StringBuilder sb = new StringBuilder();
        while (i <= n){
            int start = i;

            while (i<=n && arr[i] == arr[start]){
                i++;
            }

            for(int j = start; j < i; j++){
                if(i<=n) sb.append(i).append(" ");
                else sb.append(-1).append(" ");
            }
        }
        System.out.println(sb);
    }
}
