package programmers.스택_큐_덱;

import java.util.*;

public class 올바른괄호 {
    public static void main(String[] args){

        String s = "()()";
        System.out.println(solution(s));  //result -> true;

        String s1 = "(())()";
        System.out.println(solution(s1)); //result -> true;

        String s2 = ")()(";
        System.out.println(solution(s2)); //result -> false;

        String s3 = "(()(";
        System.out.println(solution(s3)); //result -> false;

    }
    static boolean solution(String s){
        boolean answer =true;

        Stack<Character> stack = new Stack<>();

        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c =='('){
                stack.push(c);
            }else{
                if(!stack.isEmpty()){
                   stack.pop();
                }else{
                    answer= false;
                }
            }
        }
        if(!stack.isEmpty()) answer =false;

        return answer;
    }
}
