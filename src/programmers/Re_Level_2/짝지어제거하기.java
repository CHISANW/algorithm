package programmers.Re_Level_2;


import java.util.Stack;

public class 짝지어제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }

    static int solution(String s) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(String.valueOf(s.charAt(i)));
            }else{
                String top = stack.peek();
                if(top.equals(String.valueOf(s.charAt(i)))){
                    stack.pop();
                }else{
                    stack.push(String.valueOf(s.charAt(i)));
                }
            }
        }
        return  stack.isEmpty() ? 1 : 0;

    }
}
