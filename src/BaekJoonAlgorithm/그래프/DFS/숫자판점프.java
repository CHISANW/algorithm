package BaekJoonAlgorithm.그래프.DFS;

import java.util.*;

public class 숫자판점프 {
    static int[][] board = new int[5][5];
    static Set<String> answer = new HashSet<>();
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5;i++){
            for (int j = 0; j<5;j++){
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<5;i++){
            for (int j = 0;j<5;j++){
                dfs(0,new Point(i,j),"");
            }
        }

        System.out.println(answer.size());
    }

    static void dfs(int depth,Point point, String value){
        if (depth==6){
            answer.add(value);
            return;
        }

        for (int i =0; i<4;i++){
            int nextR = point.r + dr[i];
            int nextC = point.c + dc[i];
            if (isRange(nextR,nextC)){
                dfs(depth+1,new Point(nextR,nextC),value+board[nextR][nextC]);
            }
        }
    }

    static boolean isRange(int row , int col){
        return row >= 0 && row<5 && col>=0 && col<5;
    }
    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
