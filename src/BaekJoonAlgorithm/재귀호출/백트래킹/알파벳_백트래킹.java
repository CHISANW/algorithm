package BaekJoonAlgorithm.재귀호출.백트래킹;

import java.util.Scanner;

public class 알파벳_백트래킹 {
    static int[][] board;
    static int r ,c ;
    static boolean[] check = new boolean[26];
    static int[][] visited;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        r = sc.nextInt(); // row
        c = sc.nextInt(); // col
        visited  = new int[r][c];

        board = new int[r][c];
        for(int i =0;i<r;i++){
            String line = sc.next();
            for(int j =0;j<c;j++){
                board[i][j] = line.charAt(j)-'A';       // 술자로 변경
            }
        }

        visited[0][0] = 1 << (board[0][0]);
        check[board[0][0]] = true;
        System.out.println(solve(0,0));
    }

    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};

    static int solve(int row, int col){
        int result = 0;
        for(int i =0;i<4;i++){
            int nextRow = row+dr[i] ,nextCol =col + dc[i];
            if(isBoundIndex(nextRow,nextCol, r, c)) continue;
            int next = board[nextRow][nextCol];
            if(check[next]) continue;
            int route = 1<<next;
            if(visited[nextRow][nextCol] == (visited[row][col] | route)) continue;

            check[next]= true;
            int nextResult = solve(nextRow,nextCol);
            result = Math.max(result,nextResult);
            check[next] = false;
        }
        return result + 1;
    }
    static boolean isBoundIndex(int nextR, int nextC, int row, int col){
        return nextR < 0 || nextC < 0 || nextR >= row || nextC >= col;
    }
}
