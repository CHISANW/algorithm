package BaekJoonAlgorithm.테스트;


import java.util.Scanner;

public class K번째수 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int K = stdIn.nextInt();

        long l = 1;
        long r = (long)N*N;
        long ans = -1;

        while (l<=r){
            long m = (l+r)/2;
            int count =0;

            for (int i =1; i<=N;i++)
                count+= Math.min(m/i,N);
            if (count>=K){
                ans = m;
                r = m-1;
            }else
                l = m+1;
        }
        System.out.println(ans);
    }
}
