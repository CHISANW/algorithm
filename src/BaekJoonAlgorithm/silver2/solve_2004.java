package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_2004 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long two = count(n, 2) - count(m, 2) - count(n - m, 2);
        long five = count(n, 5) - count(m, 5) - count(n - m, 5);


        System.out.println(Math.min(two,five));


    }

    static long count(long n, int p){
        long count =0;
        while (n > 0){
            n /=p;
            count+=n;
        }
        return count;
    }
}
