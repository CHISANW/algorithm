package BaekJoonAlgorithm.반복문;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제번호 10952번
 */
public class AplusBversion5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st;

        while (true){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a==0&&b==0)
                break;
            bw.write((a+b)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
