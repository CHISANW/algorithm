package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 가주아 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            boolean sum = findSum(n);
            if (sum) {
                System.out.println("Gazua");
            }else{
                System.out.println("GoHanGang");
            }

        }
    }

    static boolean findSum(int n) {
        for (int k = 2; k * (k - 1) / 2 < n; k++) {
            int sumOfKMinusOne = k * (k - 1) / 2;
            if ((n - sumOfKMinusOne) % k == 0) {
                int x = (n - sumOfKMinusOne) / k;
                if (x > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
