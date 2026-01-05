package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class solve_9421 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[n+1];

        for(int i =2 ;i<=n;i++){
            isPrime[i] = true;
        }

        for(int i =2 ; i *i<= n;i++){
            if(isPrime[i]){
                for(int j =i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =2 ;i<=n;i++){
            if(isPrime[i] && isHappy(i)){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    static boolean isHappy(int n){
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n) ){
            set.add(n);
             n = nextNumber(n);
        }
        return  n == 1;
    }

    static int nextNumber(int n){
        int sum = 0;
        while ( n > 0){
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return  sum;
    }
}
