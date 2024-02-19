package BaekJoonAlgorithm.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 10807번
 */
public class 개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count =0;

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];

        StringTokenizer st =new StringTokenizer(br.readLine());

        for (int i=0;i<N;i++){
            result[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for (int i=0;i<result.length;i++){
            if (result[i] ==b)
                count++;
        }
        sb.append(count);
        System.out.println(sb);
        br.close();

    }
}
