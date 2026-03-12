package programmers.Re_Level_2;

public class n_2_배열_자르기 {
    public static void main(String[] args) {
        System.out.println(solution(5,2,4));
    }

    static int[] solution(int n, long left, long right) {
        int[] answer =  new int[(int) (left - right + 1)];
        int index = 0;

        for(long i = left; i<= right;i++){
            int row = (int)(i/n);
            int col = (int)(i%n);
            answer[index++] = Math.max(row,col);
        }
        return answer;
    }
}
