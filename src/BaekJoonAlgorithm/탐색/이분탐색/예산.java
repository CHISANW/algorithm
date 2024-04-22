package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Scanner;

public class 예산 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        int[] money = new int[N];

        int max = 0 ;

        for (int i= 0;i<N;i++){
            money[i]=stdIn.nextInt();
            max = Math.max(max,money[i]);
        }

        int M= stdIn.nextInt();
        int l = 0, r=max, ans=-1;

        while (l<=r){
            int m = (l+r)/ 2;
            if (imPosible(money,m)<=M){
                ans= m;
                l = m+1;
            }else
                r = m-1;
        }

        System.out.println(ans);
    }

    private static int imPosible(int[] money, int m) {
        int count  =0;

        for (int i =0;i<money.length;i++){
            if (money[i]>m){
                count+=m;
            }else
                count+=money[i];
        }
        return count;
    }
}
