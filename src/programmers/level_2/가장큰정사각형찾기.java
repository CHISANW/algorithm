package programmers.level_2;

public class 가장큰정사각형찾기 {
    public static void main(String[] args) {
        int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
        System.out.println(solution(board)); //result -> 9

        int[][] board1 = {{0,0,1,1},{1,1,1,1}};
        System.out.println(solution(board1)); //result -> 4

    }

    static int solution(int[][] board){
        int row = board.length;
        int col = board[0].length;

        for(int i =1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(board[i][j] == 1){
                    int up = board[i-1][j];
                    int left = board[i][j-1];
                    int leftUp = board[i-1][j-1];

                    board[i][j] += Math.min(up, Math.min(left, leftUp));
                }
            }
        }

        int answer = 0;
        for(int i =0; i<row;i++){
            for(int j = 0; j<col; j++){
                answer = Math.max(answer, board[i][j]);
            }
        }

        return answer * answer;
    }
}
