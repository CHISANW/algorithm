package BaekJoonAlgorithm.백트래킹;

import java.util.Arrays;
import java.util.Scanner;

public class 행운의문자열 {
    static char[] arr;
    static int n;
    static boolean[] visited;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       arr = sc.next().toCharArray();
        Arrays.sort(arr);
       n = arr.length;
       visited = new boolean[n];

       backtracking(0,' ');
        System.out.println(count);
    }

    static void backtracking(int depth, char value){
        if (depth == n){
            count++;
            return;
        }

        for (int i =0; i<n;i++){
            if (visited[i]) continue;

            if (i > 0 && arr[i] == arr[i-1] && !visited[i-1]) continue;

            if (arr[i] == value) continue;
            visited[i] = true;
            backtracking(depth+1, arr[i]);
            visited[i] = false;
        }

    }
}
