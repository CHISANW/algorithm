package programmers.level_2;

import java.util.Arrays;

public class 삼각달팽이 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(4)));
        System.out.println(Arrays.toString(solution(5)));
        System.out.println(Arrays.toString(solution(6)));
    }

    static int[] solution(int n){
        int[][] tangle = new int[n][n];

        int x = -1;
        int y = 0;
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                if(i%3 == 0){       //아래
                    x++;
                }
                if(i%3 == 1){       //좌
                    y++;
                }
                if(i%3 == 2){
                    y--;
                    x--;
                }
                tangle[x][y] = num++;
            }
        }

        int size = 0;
        for(int i=1;i<=n;i++){
            size+=i;
        }
        int[] answer = new int[size];
        int index =0;
        for(int i =0; i<n;i++){
            for(int j= 0;j<n;j++){
                if(tangle[i][j] !=0 ){
                    answer[index++] = tangle[i][j];
                }
            }
        }
        return answer;
    }

}
