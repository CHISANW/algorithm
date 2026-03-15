package programmers.Level_1;

import java.util.Arrays;

public class k번쨰수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));

    }

    static int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        int ansIndex = 0;

        for(int[] command : commands){
            int start = command[0]-1;
            int end = command[1];
            int k = command[2];
            int[] arr = new int[end-start];
            for(int i = start;i<end;i++){
                arr[i-start] = array[i];
            }
            Arrays.sort(arr);
            answer[ansIndex++] = arr[k-1];
        }

        return answer;
    }
}
