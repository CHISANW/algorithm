package BaekJoonAlgorithm.silver4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class solve_5568 {
    static Set<String> set = new HashSet<>();
    static int n, k;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }

        visited = new boolean[n];
        backtracking(arr,0,"");

        System.out.println(set.size());


    }
    static void backtracking(int[] arr, int depth,String value){
        if(depth == k){
            set.add(value);
            return;
        }

        for(int i = 0; i<n;i++){
            if(visited[i]) continue;

            visited[i]= true;

            backtracking(arr,depth+1,value+arr[i]);
            visited[i] = false;
        }
    }

}
