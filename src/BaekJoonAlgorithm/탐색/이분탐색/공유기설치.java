package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 공유기설치 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int C = stdIn.nextInt();

        int[] xs = new int[N];
        for (int i = 0 ;i<N;i++){
            xs[i] = stdIn.nextInt();
        }

        Arrays.sort(xs);
        int l = 1, r =xs[N-1]-xs[0], ans = -1;

        while (l<=r){
            int m = (l+r)/2;

            if (imPosible(xs, m)>=C){
                ans = m;
                l = m+1;
            }else
                r = m-1;
        }
        System.out.println(ans);
    }

    static int imPosible(int[] xs, int m) {
        int sel = xs[0];
        int count = 1;

        for (int i =1 ; i<xs.length;i++){
            if (xs[i] - sel >= m){
                sel = xs[i];
                count++;
            }
        }
        return count;
    }
}
