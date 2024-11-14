package BaekJoonAlgorithm.백트래킹;

import java.util.*;

public class BaekJoon_19699 {
    static int n, m;
    static Set<Integer> ans = new TreeSet<>();
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        backTrackIng(0, 0, 0);

        if (ans.isEmpty()){
            System.out.println(-1);
        }else{

            for (Integer an : ans) {
                System.out.print(an+" ");
            }
        }


    }

    static void backTrackIng(int depth, int start, int sum) {
        if (depth == m) {
            if (prime(sum)) {
                ans.add(sum);
            }
            return;
        }

        for (int i = start; i < n; i++) {
            backTrackIng(depth + 1, i+1,arr[i] + sum);
        }
    }

    static boolean prime(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
