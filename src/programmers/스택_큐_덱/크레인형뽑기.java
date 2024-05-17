package programmers.스택_큐_덱;

import java.util.ArrayDeque;
import java.util.Deque;

public class 크레인형뽑기 {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Deque<Integer>[] stakes = new ArrayDeque[board.length];
        Deque<Integer> ans = new ArrayDeque<>();

        for(int i =0;i< board.length;i++){
            stakes[i] = new ArrayDeque<>();
        }

        for (int i = 0; i <board.length; i++) {
            for (int j = board.length - 1; j >=0; j--) {
                if(board[j][i]!=0) {
                    stakes[i].push(board[j][i]);
                }
            }
        }

        for(int move : moves){
            if(!stakes[move-1].isEmpty()) {
                int pop = stakes[move - 1].pop();
                if(!ans.isEmpty() && ans.peek() == pop){
                    ans.pop();
                    answer++;
                }else{
                    ans.push(pop);
                }
            }
        }
        return answer*2;
    }
}


