package programmers.level_2;

import java.util.Arrays;

public class 최솟값만들기 {
    public static void main(String[] args) {
        int[] A = {1,4,2};
        int[] B = {5,4,4};
        System.out.println(solution(A,B));      //29

        int[] A1 = {1,2};
        int[] B1 = {3,4};
        System.out.println(solution(A1,B1));      //10

    }

    public static int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0;i<A.length;i++){
            answer=answer+(A[i]*B[A.length-i-1]);
        }

        return answer;
    }
}
