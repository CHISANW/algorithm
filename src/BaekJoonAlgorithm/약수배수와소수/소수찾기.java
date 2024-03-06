package BaekJoonAlgorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 1978번 소수찾기
 */
public class 소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i =0;i<n;i++){
            int s = Integer.parseInt(st.nextToken());
            int sum = 0;
            for (int j=2;j<=s;j++){
                if (s%j==0)sum++;
           }
            if (sum==1)result++;
        }

        System.out.println(result);
        br.close();
    }
}
