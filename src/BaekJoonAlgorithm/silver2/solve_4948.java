package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_4948 {
    static int value = 123456 * 2;
    static boolean[] isPrime = new boolean[value+1];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        solve();
        StringBuilder sb = new StringBuilder();
        while (true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            int count = 0;
            for(int i = n+1;i<=2*n;i++){
                if(isPrime[i]) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());

    }


    static void solve(){
        for(int i =2 ; i<=value;i++){
            isPrime[i] = true;
        }

        for(int i = 2; i *i <=value;i++){
            if(isPrime[i]){
                for(int j =i*i;j<=value;j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }

}
