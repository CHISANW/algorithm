package BaekJoonAlgorithm.구현;

import java.util.*;

public class 스위치켜고끄기 {
    static int[] arr;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int gender = sc.nextInt();
            int number = sc.nextInt();

            if (gender == 1) {
                changeMan(number);
            } else {
                changeGirl(number);
            }
        }

        printSwitches();
    }

    static void changeGirl(int number) {
        int index = number;
        arr[index] = exchange(number);

        int start = number - 1;
        int end = number + 1;

        while (start >= 1 && end <= n) {
            if (arr[start] == arr[end]) {
                arr[start] = exchange(start);
                arr[end] = exchange(end);
            } else {
                break;
            }
            start--;
            end++;
        }
    }

    static void changeMan(int number) {
        for (int i = number; i <= n; i += number) {
            arr[i] = exchange(i);
        }
    }

    static int exchange(int number) {
        return arr[number] == 1 ? 0 : 1;
    }

    static void printSwitches() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(arr[i]).append(" ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.print(sb.toString().trim());
    }
}
