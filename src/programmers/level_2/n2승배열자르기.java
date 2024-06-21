package programmers.level_2;

import java.util.Arrays;

public class n2승배열자르기 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(3,2,5))); // result -> [3,2,2,3]

        System.out.println(Arrays.toString(solution(4,7,14))); // result -> [4,3,3,3,4,4,4,4]

    }
    public static int[] solution(int n, long left, long right) {
        int size = (int)(right - left + 1);
        int[] ans = new int[size];

        int index = 0;
        for(long i = left ; i<=right;i++){
            int row = (int)(i/n);
            int col = (int)(i%n);
            ans[index++] = Math.max(row,col)+1;
        }

        return ans;
    }
}
