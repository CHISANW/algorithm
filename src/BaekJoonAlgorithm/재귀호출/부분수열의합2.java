package BaekJoonAlgorithm.재귀호출;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 부분수열의합2 {
    static int[] numbers;
    static int s;
    static long answer = 0;
    static int status = -1;
    static int LEFT =0;
    static int RIGHT =1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = sc.nextInt();

        numbers = new int[n];
        for(int i=0; i<n; i++) {
            numbers[i] = sc.nextInt();
        }

        status = LEFT;
        solve(0, n/2, 0);

        status = RIGHT;
        solve(n/2, n, 0);

        if(s == 0) answer--;
        System.out.println(answer);
    }

    static Map<Integer,Integer> cnt = new HashMap<>();
    public static void solve(int index, int end, int sum) {
        if(index == end) {
            if(status == LEFT) {
                int prev = cnt.getOrDefault(sum, 0);
                cnt.put(sum, prev + 1);
            } else if(status == RIGHT) {
                answer += cnt.getOrDefault(s - sum, 0);
            }
            return;
        }
        solve(index + 1, end, sum);
        solve(index + 1, end, sum + numbers[index]);
    }
}
