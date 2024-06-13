package programmers.Lever_1;

public class 이웃한칸 {
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int r , c;
    public static void main(String[] args) {
        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;
        System.out.println(solution(board,h,w));    //result -> 2

        String[][] board1 = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
        int h1 = 0;
        int w1 = 1;
        System.out.println(solution(board1,h1,w1)); //result -> 1

    }
    public static int solution(String[][] board, int h, int w) {
        int answer = 0;

        r = board.length;
        c = board[0].length;

        String color = board[h][w];

        for(int i = 0;i<4;i++){
            int row = h+dr[i];
            int col = w + dc[i];
            if(!isvalid(row,col)){
                if(color.equals(board[row][col])) answer++;
            }
        }

        return answer;
    }

    static boolean isvalid(int row, int col){
        return row < 0 || row >= r || col<0 || col>=c;
    }
}
