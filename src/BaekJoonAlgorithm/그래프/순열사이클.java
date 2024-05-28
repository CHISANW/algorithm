package BaekJoonAlgorithm.그래프;

import java.util.Scanner;

public class 순열사이클 {
    static int[] nextNode;
    static boolean[] visited;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            nextNode = new int[n+1];
            visited = new boolean[n+1];
            int count = 0;
            for(int i =1; i<=n;i++){
               nextNode[i] =sc.nextInt();
            }


            for(int i =1;i<=n;i++) {
                if(!visited[i]) {
                    dfs(i);
                    count++;
                }
            }
            System.out.println(count);
        }

    }
    static void dfs(int start){
        visited[start] =true;
        if(!visited[nextNode[start]]){
            dfs(nextNode[start]);
        }
    }
}
