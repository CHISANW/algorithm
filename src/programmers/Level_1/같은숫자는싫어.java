package programmers.Level_1;

import java.util.*;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3})));

    }

    static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[arr.length-1]);

        for(int i = arr.length-1; i>=0;i--){
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }

        while (!stack.isEmpty()){
            list.add(stack.pop());
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
