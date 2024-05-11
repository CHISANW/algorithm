package BaekJoonAlgorithm.재귀호출;

import java.util.*;

public class 부분수열의합 {
    static int s;
    static int[] numbers;
    static int ans;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = sc.nextInt();

        numbers = new int[n];

        for(int i =0;i<n;i++){
            numbers[i] = sc.nextInt();
        }

        solve(0,0);

        System.out.println(ans);
    }

    static void solve(int index , int sum){
        if(index == numbers.length) return;
        if(sum+numbers[index]==s) ans++;

        solve(index + 1 , sum + numbers[index]);        //현재 인덱스의 값을 포함하고 다음 slove 실행
        solve(index + 1, sum); //현재 인덱스의 값을 포함하지않고 다음 solve 호출
    }
}
