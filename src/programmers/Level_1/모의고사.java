package programmers.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));    // [1]
        System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));    // [1,2,3]

    }
    static int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int[] result = new int[3];
        for(int i =0;i<answers.length;i++){
            if(answers[i] == one[i%5]){
                result[0]++;
            }
        }

        for(int i =0;i<answers.length;i++){
            if(answers[i] == two[i%8]){
                result[1]++;
            }
        }

        for(int i =0;i<answers.length;i++){
            if(answers[i] == three[i%10]){
                result[2]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i =0;i<3;i++){
            if(result[i] > max){
                max = result[i];
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i =0;i<3;i++){
            if(max == result[i]){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
