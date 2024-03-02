package BaekJoonAlgorithm.일반수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int a= 2; //방수
        int d =2; //시작수
        int c = 7; //끝방수
        int s = 6; // 배수

        if (n==1)sb.append(1);
        else {
            for (int i = d; i < c; i++) {
                if (n <= c) {
                    sb.append(a);
                    break;
                } else {
                    a++;
                    d = c + 1;
                    s = s + 6;
                    c = c + s;

                }
            }
        }

        System.out.println(c);
        System.out.println(sb);
        br.close();
    }
}
