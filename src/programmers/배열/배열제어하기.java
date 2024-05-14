package programmers.배열;

import java.util.*;

public class 배열제어하기 {
    public static void main(String[] args){
        int[] arr = {4,2,2,1,3,4,};
        int[] result1 = solution(arr);
        System.out.println(Arrays.toString(result1));
    }

    static int[] solution(int[] arr){

        Integer[] result =Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, (o1,o2)-> o2-o1);
        int[] a =Arrays.stream(result).mapToInt(Integer::intValue).toArray();
        return a;
    }
}
