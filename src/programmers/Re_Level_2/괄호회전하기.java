package programmers.Re_Level_2;

import java.util.Stack;

public class 괄호회전하기 {
    public static void main(String[] args) {

        System.out.println(solution("[](){}"));
    }

    public static int solution(String s) {
        int answer = 0;

        for(int i=0;i<s.length();i++){

            String rotated = s.substring(i) + s.substring(0,i);

            if(isValid(rotated)){
                answer++;
            }
        }

        return answer;
    }

    static boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else{

                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if(c==')' && top!='(') return false;
                if(c==']' && top!='[') return false;
                if(c=='}' && top!='{') return false;
            }
        }

        return stack.isEmpty();
    }
}
