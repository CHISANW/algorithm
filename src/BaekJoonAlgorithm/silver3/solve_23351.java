package BaekJoonAlgorithm.silver3;

import java.util.Arrays;
import java.util.Scanner;

public class solve_23351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 화분
        int k = sc.nextInt();   // 초기 수분량
        int a = sc.nextInt();   // a개의 화분의 물
        int b = sc.nextInt();   // 감소하는 수분량

        int[] arr = new int[n];
        Arrays.fill(arr, k); // 초기 세팅

        int ans = 1;
        while (true){
            Arrays.sort(arr);
            for (int i = 0; i < a; i++) {
                arr[i] += b;
            }

            for(int i = 0; i<n;i++){
                arr[i]--;
                if(arr[i] <= 0){
                    System.out.println(ans);
                    return;
                }
            }
            ans++;
        }

    }

}
