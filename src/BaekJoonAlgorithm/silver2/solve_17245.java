package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_17245 {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];

        int max = Integer.MIN_VALUE;
        long totalCount = 0;
        for(int i =0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<n;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, board[i][j]);
                totalCount += board[i][j];
            }
        }
        int left = 0;
        int right = max;
        int result = 0;

        while (left <= right){
            int mid = (left + right)/2;

            long on = 0;
            for(int i =0; i<n;i++){
                for(int j =0; j<n;j++){
                    on += Math.min(board[i][j], mid);
                }
            }

            if(on *2 >= totalCount){
                result = mid;
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }

        System.out.println(result);

    }
}
