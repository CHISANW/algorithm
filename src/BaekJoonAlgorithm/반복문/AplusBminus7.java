package BaekJoonAlgorithm.반복문;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제번호 11021번
 */
public class AplusBminus7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i=1;i<=T;i++){
          st= new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": " +(a+b)+"\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
