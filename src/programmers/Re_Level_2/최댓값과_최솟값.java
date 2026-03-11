package programmers.Re_Level_2;

import java.util.Arrays;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }

    static String solution(String s) {
        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        return arr[0] + " " + arr[arr.length - 1];
    }
}
