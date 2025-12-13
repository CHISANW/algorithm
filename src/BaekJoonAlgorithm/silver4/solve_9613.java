package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_9613 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0 ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            for(int i =0; i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;
            for(int i = 0; i<n;i++){
                for(int j = i+1; j<n;j++){
                    sum += gcd(arr[i], arr[j]);
                }
            }
            System.out.println(sum);
        }

    }

    public static int gcd(int a, int b){
        while (b != 0 ){
            int r = a% b;
            a = b;
            b = r;
        }
        return a;
    }
}
