package BaekJoonAlgorithm.일반수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 2720번
 */
public class 세탁소사장동혁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int q=25;
        int d = 10;
        int ni = 5;
        int p = 1;
        int n = Integer.parseInt(br.readLine());
        for (int i =0;i<n;i++) {

            int c = Integer.parseInt(br.readLine());
            if (c%q!=0) {
                sb.append(c / q+" ");
                c=c%q;
                if (c%d!=0){
                    sb.append(c/d+" ");
                    c=c%d;
                    if (c%ni!=0){
                        sb.append(c/ni+" ");
                        c=c%ni;
                        if (c%p!=0){
                            sb.append(c/p+" ");
                        }else sb.append(c/p+" ");
                    }else sb.append(c/ni+" 0");
                }else sb.append(c/d+" 0 "+"0");
            }else sb.append(c/q+" "+"0 "+"0 "+"0");

            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
