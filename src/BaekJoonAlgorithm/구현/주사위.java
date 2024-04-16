package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 주사위 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int s1 = stdIn.nextInt();
        int s2 = stdIn.nextInt();
        int s3 = stdIn.nextInt();


        int max = s1 + s2 + s3;
        int[] maxCount = new int[max + 1];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    maxCount[i + j + k]++;
                }
            }
        }

        int ans = 1;
        int ansCount = maxCount[1];
        for (int i = 2; i <= max; i++)
            if (maxCount[i] > ansCount) {
                ans = i;
                ansCount = maxCount[i];
            }

        System.out.println(ans);
    }

}