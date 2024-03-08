package BaekJoonAlgorithm.기하직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 15894번
 */
public class 수학은체육과목입니다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int square = 0;
        int sil = 0;

        for (int i = 1; i <= n; i++) {
            square += i;
            sil += (i - 1) * 2;
        }
        int result =(square * 4) - (sil * 2);
        System.out.println(result);
        br.close();
    }
}

//
//import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        long n = Long.parseLong(br.readLine());
//        System.out.println(4*n);
//        br.close();
//    }
//}
