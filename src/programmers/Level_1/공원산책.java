package programmers.Level_1;

import java.util.Arrays;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        System.out.println(Arrays.toString(solution(park,routes))); // result ->[2,1]
    }

    //E (동), W(서), S(남), N(북)
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static int n ,m;
    static String[][] board;
    public static int[] solution(String[] park, String[] routes) {

        n = park.length;
        m = park[0].length();

        board = new String[n][m];
        int[] start = new int[2];

        for(int i = 0 ;i<n;i++){
            char[] cmd = park[i].toCharArray();
            for(int j = 0; j<cmd.length;j++){
                board[i][j] = String.valueOf(cmd[j]);
                if(board[i][j].equals("S")){
                    start[0] = i;
                    start[1] = j;
                }
            }
        }


        for (String route : routes) {
            String[] splitRoute = route.split(" ");
            String direction = splitRoute[0];
            int steps = Integer.parseInt(splitRoute[1]);

            int row = start[0];
            int col = start[1];
            boolean validMove = true;

            for (int j = 0; j < steps; j++) {
                switch (direction) {
                    case "E" -> {
                        row += dr[0];
                        col += dc[0];
                    }
                    case "W" -> {
                        row += dr[1];
                        col += dc[1];
                    }
                    case "S" -> {
                        row += dr[2];
                        col += dc[2];
                    }
                    case "N" -> {
                        row += dr[3];
                        col += dc[3];
                    }
                }

                if (isOutOfRange(row, col) || board[row][col].equals("X")) {
                    validMove = false;
                    break;
                }
            }

            if (validMove) {
                start[0] = row;
                start[1] = col;
            }
        }

        return start;
    }

    static boolean isOutOfRange(int row, int col) {
        return row < 0 || row >= n || col < 0 || col >= m;
    }
}
