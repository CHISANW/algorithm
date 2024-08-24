package BaekJoonAlgorithm.그리디;

import java.util.*;

public class 주식 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int[] prices = new int[n];
            for(int i =0; i<n;i++){
                prices[i] = sc.nextInt();
            }
            long answer = 0;
            int maxPrice = prices[n-1];

            for (int i = n-2 ; i>=0;i--){
                if (prices[i] > maxPrice){
                    maxPrice = prices[i];
                }else {
                    answer += maxPrice - prices[i];
                }
            }
            System.out.println(answer);

        }
    }
}
