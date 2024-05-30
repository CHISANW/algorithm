package BaekJoonAlgorithm.그래프;

import java.util.Scanner;

//https://www.acmicpc.net/problem/9466
public class 텀프로젝트 {
    static int[] board;
    static int[] depth;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while (t-- > 0){
            int n = sc.nextInt();
            board = new int[n+1];
            depth = new int[n+1];

            for(int i =1; i<=n;i++){
                board[i]= sc.nextInt();
                depth[i] = 0;
            }
            int count = 0;
            for(int i = 1;i<=n;i++){
                if(depth[i]==0) {
                    depth[i] = 1;
                    count += dfs(i);
                }
            }

            System.out.println(n - count);
        }
    }

    static int dfs(int node){
        int next = board[node];
        int cnt = 0;

        if(depth[next] == 0){// 방문하지 않은 노드일떄
            depth[next] = depth[node] + 1;
            cnt += dfs(next);
        }else {       //방분 했던 노드일때
            cnt = depth[node] - depth[next] + 1;
        }

        depth[node] = 100001;
        return cnt < 0 ? 0 : cnt;
    }
}
