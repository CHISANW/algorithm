package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solve_1124 {
    static boolean[] isPrime = new boolean[1000001];

    public static void main(String[] args) throws Exception{
        sieve();
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int answer = 0;

        for(int i = a; i<=b;i++){
            int cnt = countPrimeFactors(i);
            if(cnt > 1 && isPrime[cnt]){
                answer++;
            }
        }
        System.out.println(answer);

    }

    static int countPrimeFactors(int n){
        int cnt = 0;

        for(int i = 2; i * i <=n;i++){
            while (n%i == 0){
                cnt++;
                n/=i;
            }
        }
        if(n > 1) cnt++;

        return cnt;
    }

    static void sieve(){
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i =2 ;i * i<=1000000;i++){
            if(!isPrime[i]) continue;
            for(int j = i*i; j<=1000000; j+=i){
                isPrime[j] = false;
            }
        }
    }
}
