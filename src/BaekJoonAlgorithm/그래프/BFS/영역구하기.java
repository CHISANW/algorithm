package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 영역구하기 {
    static int m,n,k;
    static boolean[][]visited;
    static int[][] board;
    static int[] dx = {-1,1,0,0}; // 상 하 좌 우
    static int[] dy = {0,0,-1,1};
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();

        board = new int[n][m];
        visited = new boolean[n][m];

        for (int i =0;i<k;i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int row = x1; row < x2; row++) {
                for (int col = y1; col < y2; col++) {
                    board[row][col] = 1;
                }
            }
        }

        for (int i =0; i<n;i++){
            for (int j =0;j<m;j++){
                if (board[i][j]==0 && !visited[i][j]){
                    visited[i][j]=true;
                    list.add(bfs(i,j));
                }
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }

    static int bfs(int row, int col){

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(row,col));
        int areaSize = 0;

        while (!q.isEmpty()){
            Point poll = q.poll();
           areaSize++;

            for (int i =0; i<4;i++){
                int nr = poll.r + dx[i];
                int nc = poll.c + dy[i];

                if (!isInRange(nr,nc)) continue;
                if (!visited[nr][nc] && board[nr][nc] == 0){
                    visited[nr][nc]= true;
                    q.add(new Point(nr,nc));
                }
            }
        }
        return areaSize;
    }


    static boolean isInRange(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < m;
    }

    static class Point{
        int r,c,sum;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
