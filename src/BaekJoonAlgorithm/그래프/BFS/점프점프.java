package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 점프점프 {
    static int n;
    static int[][] board;
    static boolean[][] visited;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new int[1][n];
        visited = new boolean[1][n];

        for(int i =0; i<n;i++){
            board[0][i] = sc.nextInt();
        }

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0,0,0));

        while (!q.isEmpty()){
            Point now = q.poll();
            int r = now.r; // 0 으로 고정
            int c = now.c; // 다음 값
            int count = now.count;
            if (c == n-1){
                min = Math.min(min,count);
                break;
            }

            for (int i =1; i<=board[r][c];i++){
                int nextC = c+i;
                if (nextC <n && !visited[r][nextC]) {
                    visited[r][nextC] =true;
                    q.add(new Point(r, nextC, count + 1));
                }
            }

        }
        if (min == Integer.MAX_VALUE){
            System.out.println(-1);
        }else
            System.out.println(min);
    }

    public static class  Point{
        int r;
        int c;
        int count;

        public Point(int r, int c,int count) {
            this.r = r;
            this.c = c;
            this.count = count;
        }
    }

}
