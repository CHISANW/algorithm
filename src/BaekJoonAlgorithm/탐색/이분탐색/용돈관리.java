package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Scanner;

public class 용돈관리 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int M = stdIn.nextInt();

        int[] amount = new int[N];
        for (int i =0; i<N;i++){
            amount[i]= stdIn.nextInt();
        }

        int l = 1, r =N*10000, ans = -1;

        while (l<=r){
            int m = (l+r)/2;

            if (isPossible(amount,m,M)){
                r = m-1;
                ans= m;
            }else
                l =m+1;
        }
        System.out.println(ans);
    }

    static boolean isPossible(int[] useAmounts, int drawAmount, int maxDrawCount) {
        int drawCount = 1;
        int currentAmount = drawAmount;
        for (int useAmount : useAmounts) {
            if (useAmount > drawAmount) return false;
            if (currentAmount < useAmount) {
                if (drawCount == maxDrawCount) return false;
                drawCount++;
                currentAmount = drawAmount;
            }
            currentAmount -= useAmount;
        }
        return true;
    }
}
