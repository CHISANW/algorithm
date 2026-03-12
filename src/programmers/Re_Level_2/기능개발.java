package programmers.Re_Level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 기능개발 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));

    }

    static int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        for(int i =progresses.length; i>0; i--){
            stack.push(progresses[i-1]);
        }
        List<Integer> result = new ArrayList<>();

        int day = 1;
        int index = 0;
        int count = 0;

        while (true){
            if(stack.isEmpty()) {
                result.add(count);
                break;
            }
            Integer now = stack.peek();
            int currentPro = speeds[index] * day + now;
            if(currentPro >= 100){
                stack.pop();
                index++;
                count++;
                continue;
            }

            if(count > 0){
                result.add(count);
                count= 0;
            }
            day++;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
