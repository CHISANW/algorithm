package BaekJoonAlgorithm.백트래킹;

import java.util.Scanner;

public class 모든순열 {
    static int n;
    static boolean[] visited;
    static int[] arr,num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num = new int[n];
        visited = new boolean[n];
        arr = new  int[n];

        for(int i =0; i<n;i++){
            num[i] = i+1;
        }
        backTracking(0);
    }

    static void backTracking(int depth){
        if (depth==n){
            StringBuilder sb = new StringBuilder();
            for(int i : arr){
                sb.append(i+" ");
            }
            System.out.println(sb);
            return;
        }

        for(int i =0; i<n;i++){
            if (!visited[i]) {
                visited[i] =true;
                arr[depth] = i + 1;
                backTracking(depth+1);
                visited[i]= false;
            }
        }
    }
}
