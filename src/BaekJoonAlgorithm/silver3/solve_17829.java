package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solve_17829 {
    static int[][] board;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for(int i = 0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j =0; j<n;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(polling(0,0,n));
    }

    static int polling(int r, int c, int size){
        if(size == 2){
            int[] arr  = new int[4];
            int idx =0;
            for(int i =r; i< r+2;i++){
                for(int j = c; j< c+2; j++){
                    arr[idx++] = board[i][j];
                }
            }
            Arrays.sort(arr);
            return arr[2];
        }

        int half = size/2;
        int a= polling(r,c, half);
        int b= polling(r, c+half, half);
        int c1 = polling(r+half, c, half);
        int d =  polling(r+half, c+half, half);
        int[] four = {a, b, c1 ,d};
        Arrays.sort(four);
        return four[2];
    }
}
