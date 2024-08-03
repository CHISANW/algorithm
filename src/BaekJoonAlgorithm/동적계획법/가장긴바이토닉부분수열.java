package BaekJoonAlgorithm.동적계획법;

import java.util.*;

public class 가장긴바이토닉부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dpH = new int[1001];
        int[] dpL = new int[1001];

        int[] input = new int[1001];

        for(int i=1;i<=n;i++){
            int value = sc.nextInt();
            input[i] = value;
        }

        for(int i=1;i<=n;i++){
            dpH[i] = 1;
            dpL[i] = 1;
        }

        for(int i =2;i<=n;i++){
            for(int j =i;j>=1;j--){
                if (input[i] > input[j]){
                    dpH[i] = Math.max(dpH[i], dpH[j] + 1);
                }
            }
        }

        for(int i = n -1; i>=1;i--){
            for(int j = i; j<=n;j++){
                if (input[j] < input[i]){
                    dpL[i] = Math.max(dpL[i], dpL[j] + 1);
                }
            }
        }

        int max =0;

        for(int i =1; i<=n;i++){
            if(max < dpH[i] + dpL[i]){
                max = dpH[i] + dpL[i];
            }
        }

        System.out.println(max -1);
    }
}
