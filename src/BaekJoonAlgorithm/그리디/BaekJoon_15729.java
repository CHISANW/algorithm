package BaekJoonAlgorithm.그리디;

import java.util.Scanner;

public class BaekJoon_15729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] temp = new int[n];

        for (int i =0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i<n;i++){
            if (arr[i] != temp[i]){
                count++;
                temp[i] ^= 1;

                if (i+1 <n) temp[i+1] ^= 1;
                if(i+2 <n) temp[i+2] ^= 1;
            }
        }

        System.out.println(count);
    }
}
