package BaekJoonAlgorithm.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 1316
 */
public class 그룹단어체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String aa= "";
            for (int c=0;c<s.length();c++){
                String s1 = String.valueOf(s.charAt(c));
                if (aa.contains(s1)&&s.charAt(c-1)!=s.charAt(c)){
                    aa+=s1;
                }
                aa+=s1;
            }
            if (aa.equals(s)) result+=1;
        }
        System.out.println(result);
    }
}
