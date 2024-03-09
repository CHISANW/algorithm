package BaekJoonAlgorithm.기하직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 1085번
 */
public class 직사각형에서탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken())-x;
        int h = Integer.parseInt(st.nextToken())-y;

        int result = Math.min(Math.min(Math.min(x, y), w), h);
        System.out.println(result);
    }
}
