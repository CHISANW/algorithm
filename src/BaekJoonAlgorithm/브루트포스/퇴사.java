package BaekJoonAlgorithm.브루트포스;

import java.util.*;
import java.io.*;

public class 퇴사 {
    static int n;
    static int[] days;
    static int[] profits;
    static int maxProfit = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());

        days = new int[n];
        profits = new int[n];

        for(int i =0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            days[i] = Integer.parseInt(st.nextToken());
            profits[i] = Integer.parseInt(st.nextToken());
        }

        calculator(0,0);
        System.out.println(maxProfit);
    }

    static void calculator(int day, int profit){
        if (day >= n){
            maxProfit = Math.max(profit,maxProfit);
            return;
        }

        if (day + days[day] <= n){
            calculator(day+days[day],profit+profits[day]);
        }

        calculator(day+1,profit);
    }


}
