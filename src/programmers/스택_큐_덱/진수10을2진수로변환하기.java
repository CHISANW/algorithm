package programmers.스택_큐_덱;

import java.util.*;

public class 진수10을2진수로변환하기 {
    public static void main(String[] args){
        int a = 10;
        System.out.println(solution(a));  //result => 1010

        int b = 27;
        System.out.println(solution(b));  //result -> 11011

        int c = 12345;
        System.out.println(solution(c));    //result -> 11000000111001
    }

    public static String solution(int ten){

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while(ten>0){
            int mod = ten%2;
            stack.addLast(mod);
            ten/=2;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }
}
