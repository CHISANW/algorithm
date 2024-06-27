package programmers.level_2;

public class 땅따먹기 {
    public static void main(String[] args) {

        int[][] land = {
                {1,2,3,5},
                {5,6,7,8},
                {4,3,2,1}
        };

        System.out.println(solution(land));     //result = 16;
    }

    static int solution(int[][] land){
        int answer= 0;
        for(int i =1;i<land.length;i++){
            for(int j =0; j<4;j++){
                int max = 0;
                for(int k =0; k<4;k++){
                    if(k != j) max = Math.max(max,land[i-1][k]);
                }
                land[i][j] += max;
            }
        }

        for(int[]i : land){
            for(int j : i){
                answer = Math.max(answer, j);
            }
        }
        return answer;
    }

}
