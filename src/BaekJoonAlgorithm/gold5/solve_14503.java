package BaekJoonAlgorithm.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class solve_14503 {
    static int[][] board;
    static boolean[][] cleaned;
    static int n,m, r, c , d;

    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        cleaned = new boolean[n][m];

        st= new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for(int i = 0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<m;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(simulate());
    }

    static int simulate(){
        int count =  0;

        while (true){

            if(!cleaned[r][c]){
                cleaned[r][c] = true;
                count++;
            }

            boolean moved = false;

            for(int i =0; i<4;i++){
                d = (d + 3) % 4;
                int nr = r + dr[d];
                int nc = c + dc[d];

                if(board[nr][nc] == 0 && !cleaned[nr][nc]){
                    r = nr;
                    c = nc;
                    moved = true;
                    break;
                }
            }

            if(!moved){
                int backDir = (d+2) % 4;
                int backR = r + dr[backDir];
                int backC = c + dc[backDir];
                if(board[backR][backC] == 1){
                    break;
                }

                r= backR;
                c = backC;
            }
        }
        return  count;

    }

}
