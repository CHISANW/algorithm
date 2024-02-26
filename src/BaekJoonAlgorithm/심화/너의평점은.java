package BaekJoonAlgorithm.심화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 25206번
 */
public class 너의평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = 0;       //학점 * 과목평점
        double b = 0;       // 학점 총합

        for(int i =0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            st.nextToken();
            double aDouble = Double.valueOf(st.nextToken());
            String c = st.nextToken();
            switch (c) {
                case "A+":
                    a+=aDouble*4.5;
                    b+=aDouble;
                    break;
                case "A0":
                    a+=aDouble*4.0;
                    b+=aDouble;
                    break;
                case "B+":
                    a+=aDouble*3.5;
                    b+=aDouble;
                    break;
                case "B0":
                    a+=aDouble*3.0;
                    b+=aDouble;
                    break;
                case "C+":
                    a+=aDouble*2.5;
                    b+=aDouble;
                    break;
                case "C0":
                    a+=aDouble*2.0;
                    b+=aDouble;
                    break;
                case "D+":
                    a+=aDouble*1.5;
                    b+=aDouble;
                    break;
                case "D0":
                    a+=aDouble*1.0;
                    b+=aDouble;
                    break;
                case "F":
                   a+=aDouble*0.0;
                    b+=aDouble;
                    break;
                case "p":
                    break;
                default:
                    break;
            }

        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(a/b);
    }
}
