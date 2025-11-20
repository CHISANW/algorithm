package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class solve_15688 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] count = new int[2000001];

        for(int i =0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            count[num + 1000000]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0;i<2000001;i++){
            while (count[i] > 0){
                sb.append(i-1000000).append("\n");
                count[i]--;
            }
        }
        System.out.println(sb);
    }
}

