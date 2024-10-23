package programmers.Level_3;

import java.util.Arrays;

public class 숫자게임 {
    public static void main(String[] args) {
        int[] a = {5, 1, 3, 7};
        int[] b = {2, 2, 6, 8};
        System.out.println(solution(a, b));

        int[] a1 = {2, 2, 2, 2};
        int[] b1 = {1, 1, 1, 1};
        System.out.println(solution(a1, b1));
    }

    static int solution(int[] a, int[] b) {
        int answer = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        int index = -1;
        for (int i = 0; i < a.length; i++) {
            for (int j = index + 1; j < b.length; j++) {
                if (a[i] < b[j]) {
                    answer++;
                    index = j;
                    break;
                }
            }
        }
        return answer;
    }
}
