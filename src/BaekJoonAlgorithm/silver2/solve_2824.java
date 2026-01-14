package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class solve_2824 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger aSum = BigInteger.ONE;
        for(int i =0; i<n;i++){
            aSum = aSum.multiply(new BigInteger(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        BigInteger bSum = BigInteger.ONE;
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<m;i++){
            bSum = bSum.multiply(new BigInteger(st.nextToken()));
        }

        BigInteger gcd = aSum.gcd(bSum);
        String result = gcd.toString();

        if (result.length() > 9) {
            result = result.substring(result.length() - 9);
        }

        System.out.println(result);
    }

}
