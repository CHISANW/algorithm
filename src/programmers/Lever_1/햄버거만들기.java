package programmers.Lever_1;

import java.util.*;

public class 햄버거만들기 {
    public static void main(String[] args) {
        int[] ingredient= {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ingredient));      //result -> 2

        int[] ingredient1= {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(solution(ingredient1));      //result -> 0

    }
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i : ingredient){
            stack.push(i);

            if(stack.size() >= 4){
                int size = stack.size();
                if(stack.get(size-4) == 1 && stack.get(size-3) == 2 && stack.get(size-2) == 3 && stack.get(size-1) == 1){
                    answer++;
                    for(int j=0;j<4;j++){
                        stack.pop();
                    }
                }
            }
        }

        return answer;
    }
}
