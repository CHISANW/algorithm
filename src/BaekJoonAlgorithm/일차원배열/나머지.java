package BaekJoonAlgorithm.일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 3052
 */
public class 나머지 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10];
        int count = 0;
        for (int i=0;i<10;i++){
           arr[i] = (Integer.parseInt(br.readLine()))%42;
        }

        boolean[] unique = new boolean[42];

        for (int i=0;i<arr.length;i++){
            if (!unique[arr[i]]){
                unique[arr[i]] = true;
                count++;
            }
        }

        System.out.println(count);
    }
}
