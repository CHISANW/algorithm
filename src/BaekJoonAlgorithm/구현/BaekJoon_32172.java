package BaekJoonAlgorithm.구현;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaekJoon_32172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        arr[0] = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);

        for (int i =1;i<=n;i++){
            int value = arr[i-1]-i;
            if (value<0 || set.contains(value)){
                value = arr[i-1]+i;
            }
            arr[i] = value;
            set.add(value);
        }

        System.out.println(arr[n]);
    }
}
