package BaekJoonAlgorithm.그리디;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        StringBuilder sb = new StringBuilder();
        if (n == 1){
            sb.append(1).append("\n");
        }else{
            for (int i =0; i<n;i++){
                if (i==0){
                    if (arr[i] >= arr[i+1]){
                        sb.append(i+1).append("\n");
                    }
                }else if ( i == arr.length-1){
                    if (arr[i] >= arr[i-1]){
                        sb.append(i+1).append("\n");
                    }
                }else{
                    if (arr[i] >= arr[i-1] && arr[i] >= arr[i+1]){
                        sb.append(i+1).append("\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
