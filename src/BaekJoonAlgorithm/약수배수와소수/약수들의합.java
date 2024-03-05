package BaekJoonAlgorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제번호 9506번
 * 현재 코드가 상당히 지저분함.. 나중에 메소드를 사용해 수정필요... 일단 해결
 */
public class 약수들의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true){
            int a = Integer.parseInt(br.readLine());
            int[] result = new int[10000];
            int sum= 0;
            if (a>0) {
                sb.append(a);
            }
            for (int i=1,j=0;i<a;i++){
                if (a%i==0){
                    if (a!=i){
                        result[j] = i;
                        sum+=i;
                        j++;
                    }
                }
            }
            if (sum==a&&a>0) {
                sb.append(" = ");
                for (int s=0; s< result.length;s++){
                    if (result[s] > 0) {
                        if (result[s] < result[s + 1]) {
                            sb.append(result[s] + " + ");
                        } else
                            sb.append(result[s]+"\n");
                    }
                }
            }else if (sum!=a&&a>0)
                sb.append(" is NOT perfect."+"\n");

            if (a<0) break;;
        }

        System.out.println(sb);
    }
}
