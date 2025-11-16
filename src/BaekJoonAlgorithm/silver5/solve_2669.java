package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_2669 {
    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int[][] board = new int[101][101];

        for(int i =0; i<4;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    board[x][y] = 1;
                }
            }
        }

        int ans = 0;
        for(int i =1;i<101;i++){
            for(int j =1;j<101;j++){
                if(board[i][j] == 1){
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }
}
