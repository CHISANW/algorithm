package BaekJoonAlgorithm.기하직사각형과삼각형;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제번호 5073번
 */
public class 삼각형과세변 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer token = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(token.nextToken());
            int b = Integer.parseInt(token.nextToken());
            int c = Integer.parseInt(token.nextToken());

            if(a == 0&& b == 0 && c == 0) break;

            if((a >= b+ c) || (b >= a+ c) || (c >= a+ b))
                bw.write("Invalid\n");
            else if(a ==b && b == c)
                bw.write("Equilateral\n");
            else if((a == b) || (a == c) || (b == c))
                bw.write("Isosceles\n");
            else if((a != b) && (b != c) && (c != a))
                bw.write("Scalene\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
