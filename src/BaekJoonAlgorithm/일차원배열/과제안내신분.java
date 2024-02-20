package BaekJoonAlgorithm.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5597번
 */
public class 과제안내신분 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] result= new boolean[31];

        for (int i=0;i<28;i++){
            int a = Integer.parseInt(br.readLine());
            result[a] = true;
        }

        for (int i =1;i<=30;i++){
            if (!result[i]) System.out.println(i);
        }
    }
}
