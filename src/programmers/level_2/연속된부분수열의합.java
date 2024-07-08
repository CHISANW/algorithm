package programmers.level_2;

import java.util.Arrays;

public class 연속된부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;
        System.out.println(Arrays.toString(solution(sequence,k)));      //result -> [2, 3]

        int[] sequence1 = {1, 1, 1, 2, 3, 4, 5};
        int k1 = 5;
        System.out.println(Arrays.toString(solution(sequence1,k1)));    //result -> [6, 6]

        int[] sequence2 = {2, 2, 2, 2, 2};
        int k2 = 6;System.out.println(Arrays.toString(solution(sequence2,k2)));     //result -> [0, 2]
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];

        int sum =0;
        int start  = 0;
        int minLength  = Integer.MAX_VALUE;
        for(int i =0;i< sequence.length;i++){
            sum += sequence[i];

            while (sum > k && start <= i) {
                sum -= sequence[start++];
            }

            if(sum == k){
                int currentLength = i - start + 1;
                if (currentLength < minLength){
                    minLength = currentLength;
                    answer[0] = start;
                    answer[1] = i;
                }
            }
        }

        return answer;
    }
}
