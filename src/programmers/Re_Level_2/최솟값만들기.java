package programmers.Re_Level_2;

import java.util.Arrays;

public class 최솟값만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,4,2},new int[]{5,4,4}));

    }

    static int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i =0; i<A.length;i++){
            sum += A[i]*B[B.length-i-1];
        }
        return sum;

    }
}
