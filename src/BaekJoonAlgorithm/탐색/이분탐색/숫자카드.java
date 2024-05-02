package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.*;

public class 숫자카드 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        int[] card = new int[N];
        for (int i =0;i<N;i++){
            card[i] = stdIn.nextInt();
        }

        Arrays.sort(card);

        int M = stdIn.nextInt();
        int[] ans = new int[M];

        for (int i =0;i<M;i++) {
            int data = stdIn.nextInt();
            int l =0, r=N-1;

            while (l <= r) {
                int m = (l + r) / 2;

                if (card[m] < data){
                    l = m+1;
                }else if (card[m]>data)
                    r= m-1;
                else {
                    ans[i]++;
                    break;
                }
            }
        }
      for (int i =0;i<M;i++){
          System.out.print(ans[i]+" ");
      }

    }
}
