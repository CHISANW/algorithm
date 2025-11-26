package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_14490 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split(":");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        long gcd = gcd(a,b);
        System.out.println(a/gcd + ":" + b/gcd);

    }

    private static long gcd(long a, long b){
        while (b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return  a;
    }
}
