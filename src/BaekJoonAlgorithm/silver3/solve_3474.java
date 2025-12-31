package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_3474 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
           long n = Long.parseLong(br.readLine());
           long count = 0;

           for(int i = 5; i<=n;i*=5){
               count += n/i;
           }
           sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
