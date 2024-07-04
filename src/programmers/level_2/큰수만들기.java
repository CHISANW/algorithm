package programmers.level_2;

import java.util.*;

public class 큰수만들기 {
    public static void main(String[] args) {
        System.out.println(solution("1924", 2)); //result -> "94"
        System.out.println(solution("1231234", 3)); //result -> "3234"
        System.out.println(solution("4177252841", 4)); //result -> "775841"
    }
    public static String solution(String number, int k){
        int len = number.length();
        char[] cmd = number.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<len;i++){
            char now = cmd[i];

            while (!stack.isEmpty() && stack.peek() < now && k > 0){
                stack.pop();
                k--;
            }

            stack.push(now);
        }
        while (k>0){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
