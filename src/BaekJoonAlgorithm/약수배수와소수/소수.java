package BaekJoonAlgorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 번호 2581번
 */
public class 소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum =0;
        int min=0;

        for (int i=m;i<=n;i++){
            int result =0;
            for (int j=2;j<=i;j++){
                if (i%j==0){
                    result++;
                }
            }
            if (result==1) {
                sum += i;
                if (min==0){
                    min=i;
                }

            }
        }
        if (sum!=0) {
            System.out.println(sum);
            System.out.println(min);
        }else {
            sum=-1;
            System.out.println(sum);
        }
        br.close();
    }
}
