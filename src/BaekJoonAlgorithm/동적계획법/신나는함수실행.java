package BaekJoonAlgorithm.동적계획법;

import java.util.*;

public class 신나는함수실행 {
    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int answer = w(a, b, c);
            System.out.println("w("+a+", "+b+", "+c+") = "+answer);  // 예시 출력
        }

    }

    public static int w(int a, int b, int c) {
        String key = a + "," + b + "," + c;

        if (a==-1 && b== -1 && c==-1){
            System.exit(0);
        }

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int result;

        if (a <= 0 || b <= 0 || c <= 0) {
            result = 1;
        } else if (a > 20 || b > 20 || c > 20) {
            result = w(20, 20, 20);
        } else if (a < b && b < c) {
            result = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        } else {
            result = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
        memo.put(key, result);

        return result;
    }
}
