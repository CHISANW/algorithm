package programmers.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {
    public static void main(String[] args){

        int[] answers  = {1,2,3,4,5};       // return [1]
        System.out.println(Arrays.toString(solution(answers)));

        int[] answers1 ={1,3,2,4,2};        //return [1,2,3]
        System.out.println(Arrays.toString(solution(answers1)));
    }

    public static int[] solution(int[] answers){
        int[][] pattern = {
                { 1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] score = new int[3];

        for(int i =0;i<answers.length;i++){
            for(int j =0;j<pattern.length;j++){
                if(answers[i]==pattern[j][i%pattern[j].length]){
                    score[j]++;
                }
            }
        }
        int max = Arrays.stream(score).max().getAsInt();    //최댓값 찾아주고

        List<Integer> a = new ArrayList<>();
        for(int i =0;i<score.length;i++){
            if(max== score[i]){     // 현재 score배열에서 최댓값이랑 같은 인원이있을때 0 부터 배열을 시작했으니 +1로 더해서 리스트에 삽입
                a.add(i+1);
            }
        }
        return a.stream().mapToInt(Integer::intValue).toArray();//이제 리스트에서 배열로반환 해야함
    }
}
