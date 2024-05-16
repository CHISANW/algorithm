package programmers.스택_큐_덱;

import java.util.*;

public class 괄호회전하기 {
    public static void main(String[] args){
        String s1 = "[](){}";
        System.out.println(solution(s1));           //result -> 3

        System.out.println(s1+s1);
    }


    static int solution(String s){

        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        int answer = 0;
        int n = s.length();
        s += s;

        A:for(int i =0;i<n;i++){
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for(int j = i;j<i+n;j++){
                char c = s.charAt(j);

                if(!map.containsKey(c)){
                    stack.push(c);
                }else{
                    if(stack.isEmpty() || !stack.pop().equals(map.get(c)))
                        continue A;
                }
            }
            if(stack.isEmpty()){
                answer++;
            }
        }

        return answer;
    }
}
