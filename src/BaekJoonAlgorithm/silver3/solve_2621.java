package BaekJoonAlgorithm.silver3;

import java.util.*;

public class solve_2621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cntColor = new int[4]; // R B Y G 순서
        int[] cntNum = new int[10];  // 1~9
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            String col = sc.next();
            int num = sc.nextInt();
            nums[i] = num;
            cntNum[num]++;

            switch(col) {
                case "R": cntColor[0]++; break;
                case "B": cntColor[1]++; break;
                case "Y": cntColor[2]++; break;
                case "G": cntColor[3]++; break;
            }
        }

        Arrays.sort(nums);

        boolean sameColor = false;
        for (int c : cntColor) {
            if (c == 5) sameColor = true;
        }

        boolean straight = true;
        for (int i = 1; i < 5; i++) {
            if (nums[i] != nums[i-1] + 1) {
                straight = false;
                break;
            }
        }

        int score = 0;

        if (sameColor && straight) {
            score = 900 + nums[4];
        }

        else if (hasCount(cntNum, 4)) {
            int x = getKeyByCount(cntNum, 4);
            score = 800 + x;
        }

        else if (hasCount(cntNum, 3) && hasCount(cntNum, 2)) {
            int a = getKeyByCount(cntNum, 3);
            int b = getKeyByCount(cntNum, 2);
            score = 700 + (a * 10 + b);
        }

        else if (sameColor) {
            score = 600 + nums[4];
        }

        else if (straight) {
            score = 500 + nums[4];
        }

        else if (hasCount(cntNum, 3)) {
            int x = getKeyByCount(cntNum, 3);
            score = 400 + x;
        }

        else if (countPairs(cntNum) == 2) {
            List<Integer> pairs = getPairKeys(cntNum);
            Collections.sort(pairs);
            int big = pairs.get(1), small = pairs.get(0);
            score = 300 + (big * 10 + small);
        }

        else if (countPairs(cntNum) == 1) {
            int x = getKeyByCount(cntNum, 2);
            score = 200 + x;
        }
        else {
            score = 100 + nums[4];
        }

        System.out.println(score);
    }

    static boolean hasCount(int[] arr, int k) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == k) return true;
        }
        return false;
    }

    static int getKeyByCount(int[] arr, int k) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == k) return i;
        }
        return 0;
    }

    static int countPairs(int[] arr) {
        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2) cnt++;
        }
        return cnt;
    }

    static List<Integer> getPairKeys(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 2) list.add(i);
        }
        return list;
    }
}
