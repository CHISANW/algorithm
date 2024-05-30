package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2748
public class 피보나치수2 {
    static long[] memo = new long[95];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(fibo(n));
//        System.out.println(fibo1(n));
        System.out.println(fibo3(n));

    }
    //하향식 방법 재귀를 사용
    static long fibo(int n){
        if(n == 1 || n==2)
            return 1;
       if(memo[n] != 0) return memo[n];
        memo[n] = fibo(n-1) + fibo(n-2);
        return memo[n];
    }

    //상향식 첫번쨰 방법
    static long fibo1(int n){
       memo[1]=memo[2] = 1;
       for(int i = 3;i<=n;i++){
           memo[i] = memo[i-1]+ memo[i-2];
       }
       return memo[n];
    }

    //상향식 누적합을 사용한 방법
    static long fibo3(int n){
        memo[1] = 1;

        for(int i = 1;i<=n;i++){
            memo[i+1] += memo[i];
            memo[i+2] += memo[i];
        }
        return memo[n];
    }
}
