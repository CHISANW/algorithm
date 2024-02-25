package BaekJoonAlgorithm.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 2675번
 */
public class 문자열반복 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int s = Integer.parseInt(br.readLine());

        for (int i=0;i<s;i++){
            String s1 = br.readLine();
            StringTokenizer st = new StringTokenizer(s1, " ");
            int s2 = Integer.parseInt(st.nextToken());
            String s3 = st.nextToken();

            for (int j=0;j<s3.length();j++){
                for (int k=0;k<s2;k++){
                    sb.append(s3.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
