package BaekJoonAlgorithm.구현;

import java.util.*;
import java.io.*;

public class 테트로미노 {
    static int[][] board;
    static boolean[][] visited;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int n, m;
    static int answer;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n =Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m];


        for(int i =0; i<n;i++){
            StringTokenizer token = new StringTokenizer(br.readLine()," ");
            for(int j =0; j<m;j++){
                board[i][j] = Integer.parseInt(token.nextToken());
            }
        }


        for(int i =0; i<n;i++){
            for(int j =0; j<m;j++){
                visited[i][j]= true;
                solution(i,j,1,board[i][j]);
                visited[i][j] = false;
            }
        }

        System.out.println(answer);
    }

    static void solution(int row, int col, int depth, int sum){
        if(depth == 4){
            answer = Math.max(sum,answer);
            return;
        }

        for(int i =0; i<4;i++){
            int nextRow = row + dr[i];
            int nextCol = col + dc[i];

            if(!isRange(nextRow, nextCol)) continue;
            if(!visited[nextRow][nextCol]){
                if(depth == 2){
                    visited[nextRow][nextCol] = true;
                    solution(nextRow, nextCol , depth+1, sum+board[nextRow][nextCol]);
                    visited[nextRow][nextCol] = false;
                }

                visited[nextRow][nextCol] = true;
                solution(row, col, depth+1, sum + board[nextRow][nextCol]);
                visited[nextRow][nextCol] = false;
            }

        }
    }

    static boolean isRange(int row ,int col){
        return row >= 0 && row < n && col >= 0 && col < m;
    }
}
