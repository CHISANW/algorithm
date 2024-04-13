package BaekJoonAlgorithm.일차원배열;

import java.util.Scanner;

public class 줄세우기 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int p = stdIn.nextInt();

        while (p-- >0){
            int t = stdIn.nextInt();
            int[] h = new int[20];

            for (int i=0;i<20;i++){
                h[i] =stdIn.nextInt();
            }

            int cnt = 0;
            int[] sorted = new int[20];
            for (int i =0;i<20;i++) {

                boolean find = false;
                for (int j = 0; j < i; j++) {
                    if (sorted[j] > h[i]) {
                        find = true;

                        for (int k = i - 1; k >= j; k--) {
                            sorted[k + 1] = sorted[k];
                            cnt++;
                        }

                        sorted[j] = h[i];
                        break;
                    }
                }
                if (!find) sorted[i] = h[i];

            }
            System.out.println(t + " " + cnt);
        }
    }
}
