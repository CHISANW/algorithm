package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_2078 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long leftCount = 0;
        long rightCount = 0;

        while (a > 1 && b>1){
            if(a>b){
                leftCount += a/b;
                a %= b;
            }else{
                rightCount += b/a;
                b %= a;
            }
        }

        leftCount += a-1;
        rightCount += b-1;

        System.out.println(leftCount + " " + rightCount);
    }
}
