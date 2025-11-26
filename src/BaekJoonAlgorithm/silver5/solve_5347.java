package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_5347 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0){
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            sb.append(lcm(a,b)).append("\n");
        }

        System.out.println(sb);
    }

    private static long gcd(long a, long b){
        while (b != 0){
            long temp = b;
            b = a% b;
            a = temp;
        }
        return  a;
    }

    private static long lcm(long a, long b){
        return  a / gcd(a,b) * b;
    }
}
