package programmers.그리디;

import java.util.LinkedList;
import java.util.Queue;

public class 경주로건설 {

    public static void main(String[] args) {
        int[][] board = {{0,0,0},{0,0,0},{0,0,0}};
        System.out.println(solution(board));        //result ->

        int[][] board1 = {{0,0,1,0},{0,0,0,0},{0,1,0,1},{1,0,0,0}};
        System.out.println(solution(board1));        //result ->
    }

    static int n;
    static int[][][] visited;
    static int[] dr = {0, -1, 0, 1};
    static int[] dc =  {-1, 0, 1, 0};
    public static int solution(int[][] board) {

        n = board.length;

        Queue<Point> q  = new LinkedList<>();
        visited= new int[n][n][4];
        q.add(new Point(0,0,-1,0));
        int ans = Integer.MAX_VALUE;


        while (!q.isEmpty()){
            Point now = q.poll();

            for(int i = 0; i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];

                if(isValid(board,nr,nc)) continue;
                
                //해당 위치까지 오면 모든 valid 체크
                // 탐색할 경로의 방향의 따라 비용을 계싼
                int newCost = calNewCost(i, now.rout, now.cost);

                if(nr==n-1 && nc == n-1){
                    ans = Math.min(newCost, ans);
                }else if (isUpdate(i,nr,nc,newCost)){       // 비용을 업데이트가 가능하다면
                    q.add(new Point(nr,nc,i,newCost));      // 큐에 새로운 용을 넣고
                    visited[nr][nc][i] = newCost;
                }

            }
        }
        return ans;
    }


    // 아직 방분하지 않았거나 새로운 비용이 작다면
    static boolean isUpdate(int route, int x, int y, int newCost){
        return  visited[x][y][route] == 0 || visited[x][y][route] > newCost;
    }
    // 회전축을 만났을때 비용 계산
    static int calNewCost(int route, int preRoute, int cost){
        // 현재 방향이 일치하거나 같은 방향일때에는 100원을 더하고
        if (preRoute == -1 || (route + preRoute) % 2 == 0){
            return cost+100;
        }
        //아닐시에는 600원을 더한다.
        return cost + 600;
    }

    // 탐색할 경로의 범위를 체크
    static boolean isOutOfRange(int r, int c){
        return 0 <= r  &&  r< n && 0<= c &&  c< n;
    }

    //탐색 가능한 배열인지 검증하는 메소드
    static boolean isValid(int[][] board, int r ,int c){
        return (r == 0 && c == 0) || !isOutOfRange(r,c) || board[r][c] == 1;
    }
    static class Point{
        int r, c, rout,cost;       //r= row, c = col, rout = (방향, 경로), cost = 현재 비용

        public Point(int r, int c, int rout, int cost) {
            this.r = r;
            this.c = c;
            this.rout = rout;
            this.cost = cost;
        }
    }
}
