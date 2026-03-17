package BaekJoonAlgorithm.Re_silver.level4;

import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] money = new int[n];

        for(int i =0; i<n;i++){
            money[i] = sc.nextInt();
        }

        Arrays.sort(money);

        int sum = 0;
        for(int i =0; i<=n;i++){
            int temp = 0;
            for(int j =0; j<i;j++){
                temp += money[j];
            }
            sum += temp ;
        }

        System.out.println(sum);

    }

}
