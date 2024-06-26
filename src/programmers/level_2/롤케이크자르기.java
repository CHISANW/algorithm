package programmers.level_2;

import java.util.*;

public class 롤케이크자르기 {
    public static void main(String[] args) {
        int[] topping ={1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(solution(topping));

        int[] topping1 ={1, 2, 3, 1, 4};
        System.out.println(solution(topping1));

    }

    public static int solution(int[] topping) {
        int answer = 0;

        int n = topping.length;

        Set<Integer> leftSet = new HashSet<>();
        int[] leftArr = new int[n];

        for(int i = 0; i<n;i++){
            leftSet.add(topping[i]);
            leftArr[i]= leftSet.size();
        }

        Set<Integer> rightSet = new HashSet<>();
        int[] rightArr = new int[n];

        for(int i = n-1; i>=0;i--){
            rightSet.add(topping[i]);
            rightArr[i]= rightSet.size();
        }

        for(int i = 0;i<n-1;i++){
            if(leftArr[i] == rightArr[i+1]){
                answer++;
            }
        }
        return answer;
    }

}
