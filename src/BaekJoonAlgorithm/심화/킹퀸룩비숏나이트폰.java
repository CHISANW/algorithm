package BaekJoonAlgorithm.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * 문제번호 2444번
 */
public class 킹퀸룩비숏나이트폰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] ches= new int[]{1,1,2,2,2,8};

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i<ches.length;i++){
            int n = Integer.parseInt(st.nextToken());
            sb.append(ches[i]-n).append(" ");
        }
        System.out.println(sb);
        br.close();

    }
}
