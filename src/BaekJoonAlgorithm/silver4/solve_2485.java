package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_2485 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());;
        }

        int gcd = arr[1] - arr[0];
        for(int i =2; i<n;i++){
            gcd = gcd(gcd, arr[i] - arr[i-1]);
        }

        int result = 0;
        for(int i = 1; i<n;i++){
            int gap = arr[i] - arr[i-1];
            result += (gap/gcd) - 1;
        }
        System.out.println(result);

    }

    static public int gcd(int a, int b){
        while (b!= 0 ){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
