package programmers.Re_Level_2;

import java.util.Arrays;

public class 다음큰숫자 {
    public static void main(String[] args) {

        System.out.println(solution(78));
    }

    static int solution(int n) {
        int count = Integer.bitCount(n);

        for (int i = n + 1; ; i++) {
            if (Integer.bitCount(i) == count) {
                return i;
            }
        }

    }
}
