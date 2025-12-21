package BaekJoonAlgorithm.silver4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class solve_1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        int s = sc.nextInt();
        Arrays.sort(arr);

        for(int x : arr){
            if(x==s){
                System.out.println(0);
                return;
            }
        }

        int start = 0;
        int end = 1001;

        for(int i = 0;  i<n;i++){
            if(arr[i] < s) {
                start= arr[i];
            }
            else {
                end =  arr[i];
                break;
            }
        }

        int left = s - start;
        int right = end - s;

        System.out.println(left * right - 1);

    }
}
