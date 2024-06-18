package programmers.Level_1;

import java.util.*;
import java.util.stream.*;

public class 과일장수 {
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(k,m,score)); //result ->	8

    }
    public static int solution(int k, int m, int[] score) {
        List<Integer> list = Arrays.stream(score)
            .boxed()
            .sorted((o1, o2) -> Integer.compare(o2,o1))
            .collect(Collectors.toList());

        int count = 0;
        for(int i = 0; i<score.length;i+=m){
            if(i+m-1<score.length){
                int a = list.get(i+m-1);
                count+= a * m;
            }
        }
        return count;
    }

}
