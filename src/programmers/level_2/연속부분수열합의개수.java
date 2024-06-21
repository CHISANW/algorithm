package programmers.level_2;

import java.util.*;

public class 연속부분수열합의개수 {
    public static void main(String[] args) {
        int[] elements = {7,9,1,1,4};
        System.out.println(solution(elements)); //result 18
    }

    public static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for(int i =1;i<=elements.length;i++){
            for(int j = 0; j<elements.length;j++){
                int sum = 0;
                for(int k = j; k<i+j;k++){
                    sum += elements[k%elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
