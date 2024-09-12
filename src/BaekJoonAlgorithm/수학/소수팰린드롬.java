package BaekJoonAlgorithm.수학;

import java.util.*;

public class 소수팰린드롬 {
    static int max = 2000000;
    public static void main(String[] args) {
        boolean[] sieve = sieve();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n;i<max;i++){
            if (sieve[i]){
                String value = String.valueOf(i);

                StringBuilder sb = new StringBuilder();
                String pal = sb.append(value).reverse().toString();
                if (value.equals(pal)){
                    System.out.println(i);
                    return;
                }
            }
        }
    }

    public static boolean[] sieve(){
        boolean[] isPrime = new boolean[max];
        Arrays.fill(isPrime, true);
        isPrime[0]= false;
        isPrime[1] =false;

        for (int i= 2;i*i<max;i++){
            if (isPrime[i]){
                for (int j = i*i ;j<max; j += i){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
     }
}
