package programmers.level_2;

import java.util.*;

public class 무인도여행 {
    public static void main(String[] args) {
        String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
        System.out.println(Arrays.toString(solution(maps)));        // result -> [1, 1, 27]

        String[] maps1 = {"XXX","XXX","XXX"};
        System.out.println(Arrays.toString(solution(maps1)));        // result -> [-1]
    }

    static int[][] board;
    static boolean[][] check;
    static int row, col;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static int[] solution(String[] maps) {
        List<Integer> list = new ArrayList<>();
        row = maps.length;
        col = maps[0].length();

        board = new int[row][col];
        check = new boolean[row][col];

        for(int i =0 ; i<row;i++){
            char[] cmd = maps[i].toCharArray();
            for(int j = 0; j<cmd.length;j++){
                if(cmd[j] == 'X'){
                    board[i][j] = -1;
                }else{
                    board[i][j] = cmd[j]-'0';
                }
            }
        }

        for(int i = 0; i<row;i++){
            for(int j = 0; j<col; j++){
                if(board[i][j] != -1 && !check[i][j]){
                    int value = bfs(i, j);
                    list.add(value);
                }
            }
        }

        if(list.isEmpty()) return new int[]{-1};

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(result);


        return result;
    }

    static int bfs(int row, int col){
        Queue<Point> q = new LinkedList<>();
        int count = board[row][col];

        q.add(new Point(row, col));
        check[row][col] = true;

        while(!q.isEmpty()){
            Point now =q.poll();

            for(int i =0; i<4;i++){
                int nr = now.r + dx[i];
                int nc = now.y + dy[i];

                if (isRange(nr, nc) && !check[nr][nc] && board[nr][nc] != -1) {
                    count += board[nr][nc];
                    check[nr][nc] = true;
                    q.add(new Point(nr, nc));
                }
            }

        }

        return count;
    }

    static boolean isRange(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }

    static class Point{
        int r, y;

        public Point(int r, int y){
            this.r = r;
            this.y = y;
        }
    }
}
