package BaekJoonAlgorithm.탐색.이분탐색;

import java.util.Scanner;

public class 보석상자 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int M = stdIn.nextInt();
        int[] colorAmounts = new int[M];
        for (int i = 0; i < M; i++)
            colorAmounts[i] = stdIn.nextInt();

        int l = 1, r = 1000000000, ans = -1;

        while (l<=r){
            int m = (l+r)/2;

            if(imPosible(colorAmounts,m,N)){
                ans=m;
                r = m-1;
            }else
                l= m+1;
        }

        System.out.println(ans);

    }

    private static boolean imPosible(int[] robyArr, int maxDivideCount, int totalStudentCount) {
        int receivedStudentCount = 0;
        for (int colorAmount : robyArr)
            receivedStudentCount += (colorAmount + maxDivideCount - 1) / maxDivideCount;
        return receivedStudentCount <= totalStudentCount;
    }
}
