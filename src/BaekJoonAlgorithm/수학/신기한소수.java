package BaekJoonAlgorithm.수학;

import java.io.*;

public class 신기한소수 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dfs(0, n);
    }

    static void dfs(int num, int n){
        if (n==0){
            System.out.println(num);
        }
        for (int i =1 ;i<10;i++){
            int temp = 10 * num +i;
            if(n >0 && isPrime(temp)){
                dfs(temp, n-1);
            }
        }
    }

    static boolean isPrime(int num){
        if (num<2) return false;
        for (int i = 2; i*i<=num;i++)
            if (num % i ==0){
                return false;
            }
        return true;
    }

}
