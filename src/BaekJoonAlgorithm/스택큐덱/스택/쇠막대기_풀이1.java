package BaekJoonAlgorithm.스택큐덱.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쇠막대기_풀이1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] array = br.readLine().toCharArray();

        int count = 0;
        int ans =0;
        for (int i =0;i<array.length;i++){
            if (array[i] == '('){
                count++;
            }else {
                count--;
                if (array[i-1] == '('){
                    ans+= count;
                }else
                    ans++;
            }

        }
        System.out.println(ans);

    }
}
