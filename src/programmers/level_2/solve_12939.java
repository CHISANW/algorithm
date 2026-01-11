package programmers.level_2;

import java.util.Arrays;

public class solve_12939 {
    public static void main(String[] args) {
        String solution = solution("1 2 3 4");
        String solution1 = solution("-1 -2 -3 -4");
        System.out.println(solution);
        System.out.println(solution1);

    }

    public static String solution(String s) {
        String[] arr = s.split(" ");
        int[] intArr = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(intArr);
        return intArr[0] + " " + intArr[intArr.length - 1];
    }
}
