package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 달팽이 {
    static int[] dx = {-1,0,1, 0};
    static int[] dy = {0,1,0,-1};
    static int[][] board;
    static int n, answer;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        answer = sc.nextInt();
        int row = 0;
        int col = 0;

        board = new int[n][n];
        create();

        StringBuilder sb = new StringBuilder();
        for (int i =0; i<n;i++){
            for(int j =0;j<n;j++){
                sb.append(board[i][j]+" ");
                if (board[i][j] == answer){
                    row = i+1;
                    col = j+1;
                }

            }
            sb.append("\n");
        }
        sb.append(row+" "+col);
        System.out.println(sb);
    }

    static void create(){
        int row = n/2;
        int col = n/2;

        int next = 0;       // 방향 전환
        int count = 0;      // 같은 방향 이동

        int max = 1; //이동횟수
        int ls = 0; // 두번 방향을 바꾸변 변경됨

        for (int i =1; i<=n*n; i++){     // 7일떄는 49번
            board[row][col] = i;        // 시작은 1
            
            row += dx[next % 4];
            col += dy[next % 4];
            count++;                //같은 방향으로 이동하니 증가

            if (count == max){      // 같다는건 방향을 바꿔야함
                next++;     //방향전환
                count =0;   // 초기화
                ls++;
            }

            if (ls == 2){       // 2번씩 최대 이동거리를 변경
                max++;
                ls = 0;
            }
        }
    }
}
