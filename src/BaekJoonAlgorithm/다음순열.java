package BaekJoonAlgorithm;

import java.io.*;
import java.util.*;

public class 다음순열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0 ;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (next(arr)){
            for (int i : arr){
                sb.append(i +" ");
            }
        }else
            sb.append(-1);


        System.out.println(sb);
    }

    static boolean next(int[] arr){
        int i = arr.length -1;

        while (i > 0 && arr[i-1] >= arr[i]){
            i--;
        }
        if (i <= 0){
            return false;
        }

        int j = arr.length - 1;

        while (arr[j] <= arr[i-1]){
            j--;
        }

        int temp = arr[i-1];
        arr[i-1] = arr[j];
        arr[j] = temp;

        j = arr.length-1;
        while (i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return true;
    }
}
