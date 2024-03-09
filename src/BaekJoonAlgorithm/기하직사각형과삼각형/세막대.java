package BaekJoonAlgorithm.기하직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 14215번
 */
public class 세막대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max((Math.max(a, b)), c);
        int sum=max;
        while (true){
            if (sum>=(a+b+c)-max){
                sum= sum-1;
            }else
                break;
        }

        int result = ((a+b+c)-max)+sum;

        System.out.println(result);
    }
}
