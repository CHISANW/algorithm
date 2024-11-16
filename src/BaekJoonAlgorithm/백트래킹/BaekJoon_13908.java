package BaekJoonAlgorithm.백트래킹;

import java.util.*;

public class BaekJoon_13908 {
    static int n, m;
    static int count = 0;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[10];

        for (int i =0; i<m;i++){
            visited[sc.nextInt()] = true;
        }

        backtrack(0,0);
        System.out.println(count);
    }

    private static void backtrack(int depth, int cnt) {
        if (depth == n){
            if (cnt == m) count++;
            return;
        }

        for (int i = 0; i<=9;i++){
            if (visited[i]){
                visited[i] =false;
                backtrack(depth+1, cnt+1);
                visited[i] = true;
            }else{
                backtrack(depth+1,cnt);
            }
        }
    }
}
