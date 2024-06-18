package programmers.Level_1;

import java.util.Arrays;

//에라토스테네스의 체(Sieve of Eratosthenes) 알고리즘을 사용해서 풀이
public class 소수찾기 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));

    }
    public static int solution(int n) {
        if(n <2)
            return 0;

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        int count=  0;

        for(int i = 2;i<=n;i++){
            for(int j = i*i;j<=n;j+=i){
                isPrime[j] = false;
            }
        }

        for(int i = 2;i<=n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}
