package programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pr_136798 {
    public static void main(String[] args) {
        solution(5,3,2);
        Arrays.fill(dp,0);
        solution(10,3,2);
    }

    static int[] dp;
    static public void solution(int number , int limit , int power){
        dp = new int[number+1];

        for(int i = 1; i<=number;i++){
            getDivers(i);
        }

        int sum = 0;
        for(int i =1; i<=number;i++){
            if(dp[i] <= limit){
                sum+= dp[i];
            }else{
                sum+=power;
            }
        }
        System.out.println(sum);
    }

    static public void getDivers(int n){
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; i * i<=n; i++){
            if(n% i == 0){
                divisors.add(i);
                if(i != n/i){
                    divisors.add(n/i);
                }
            }
        }
        dp[n] = divisors.size();
    }

}

