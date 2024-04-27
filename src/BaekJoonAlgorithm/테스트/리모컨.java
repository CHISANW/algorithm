package BaekJoonAlgorithm.테스트;

import java.io.IOException;
import java.util.Scanner;

public class 리모컨 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();                   //찾고자 하는 채널
        int M = sc.nextInt();                   // 고장난 버튼의수
        boolean[] isBroken = new boolean[10];
        for (int i = 0; i < M; i++)
            isBroken[sc.nextInt()] = true;          // 고장난 버튼의 배열을 true로 초기화

        int ans = (N > 100 ? N - 100 : 100 - N);        // 음수가 나올수 있기떄문에 검사
        for (int delta = 0; delta < ans; delta++) {     //
            int[] numberToMake = {N + delta, N - delta};
            for (int number : numberToMake)
                if (number >= 0 && canMakeNumber(number, isBroken))
                    ans = Math.min(ans, Integer.toString(number).length() + delta);
        }
        System.out.println(ans);
    }

    static boolean canMakeNumber(int x, boolean[] isBroken) {
        if (x == 0) return !isBroken[0];
        while (x > 0) {
            if (isBroken[x % 10])
                return false;
            x /= 10;
        }
        return true;
    }
}
