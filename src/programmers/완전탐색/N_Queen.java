package programmers.완전탐색;

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n)); // result -> 2;
    }
    
    static int[] queen ;        //queen[1] = 4;  1열의 4행의 이라는 뜻
    static int solution(int n){
        queen = new int[n];
        int ans = dfs(n,0);
        return ans;
    }

    static int dfs(int n, int row){
        int count = 0;
        if(n == row) return 1;
        for(int col =0; col<n;col++){
            if(isValid(row,col)){
                queen[row] = col;
                count += dfs(n, row+1);
            }
        }
        return count;
    }

    static boolean isValid(int row, int col){
        for(int i = 0; i<row;i++){
            if(queen[i] == col) return false;       // 현재 선택한 i번 행이 검사할 행과 같기떄문에 위치할수 없다.
            if(Math.abs(row-i) == Math.abs(col - queen[i])) return false;
        }
        return true;
    }
}
