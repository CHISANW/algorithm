package BaekJoonAlgorithm.구현;

import java.util.*;

public class 단어맞추기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            char[] arr = str.toCharArray();

            if (nextPermutation(arr)) {
                sb.append(new String(arr)).append("\n");
            } else {
                sb.append(str).append("\n");
            }
        }

        System.out.println(sb);
    }

    static boolean nextPermutation(char[] arr) {
        int i = arr.length - 1;

        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) {
            j--;
        }
        char temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}
