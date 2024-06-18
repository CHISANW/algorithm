package programmers.Level_1;

import java.util.Arrays;

public class 바탕화면정리 {
    public static void main(String[] args) {

        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(solution(wallpaper))); //result -> [0, 1, 3, 4]

        String[] wallpaper1 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        System.out.println(Arrays.toString(solution(wallpaper1))); //result -> [1, 3, 5, 8]
    }

    static int[][] board;
    static int n ,m;
    static int maxRow = 0, maxCol = 0;
    static int minRow = 50,minCol =50;
    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        n = wallpaper.length;
        m = wallpaper[0].length();

        board = new int[n][m];

        for(int i =0;i<n;i++){
            char[] cmd = wallpaper[i].toCharArray();
            for(int j= 0; j<m;j++){
                if(cmd[j]=='#'){
                    board[i][j] = 1;
                    maxRow = Math.max(i,maxRow);
                    maxCol = Math.max(j,maxCol);
                    minRow = Math.min(i, minRow);
                    minCol = Math.min(j, minCol);
                }
            }
        }

        answer[0] = minRow;
        answer[1] = minCol;
        answer[2] = maxRow+1;
        answer[3] = maxCol+1;
        return answer;
    }
}
