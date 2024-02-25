package BaekJoonAlgorithm.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 2908번
 */
public class 상수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a= 0;
        int b =0;

        String s = st.nextToken();
        String s1 = st.nextToken();
        for (int i =s.length(), j=0; j<3&&i>0;i--,j++){
            int c = Integer.parseInt(String.valueOf(s.charAt(i-1)));
            int d = Integer.parseInt(String.valueOf(s1.charAt(i-1)));
            a = a*10 +c;
            b = b*10 + d;
        }

        if (a >b)
            sb.append(a);
        else
            sb.append(b);

        System.out.println(sb);
        br.close();
    }
}
