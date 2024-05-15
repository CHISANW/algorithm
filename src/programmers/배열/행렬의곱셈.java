package programmers.배열;

import java.util.*;

public class 행렬의곱셈 {
    public static void main(String[] args){
        int[][] type1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] type2 = {{3, 3}, {3, 3}};

        int[][] answer1 = solution(type1, type2);
        System.out.println(Arrays.deepToString(answer1));

        int[][] type3 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] type4 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        int[][] answer2 = solution(type3, type4);
        System.out.println(Arrays.deepToString(answer2));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2){
        int r1= arr1.length;
        int c1 = arr1[0].length;
        int c2 = arr2[0].length;

        int[][] ans = new int[r1][c2];

        for(int i =0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for(int k = 0;k<c1;k++){
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return ans;
    }
}
