package BaekJoonAlgorithm.그리디;

import java.util.*;

public class BaekJoon_25918 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String line = sc.next();

        Stack<Character> stack = new Stack<>();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            char ch = line.charAt(i);

            if (!stack.isEmpty() && (stack.peek()=='(' && ch==')'|| stack.peek()==')' && ch=='(')){
                stack.pop();
            }else{
                stack.push(ch);
            }

            answer =Math.max(answer,stack.size());
        }

        if (!stack.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(answer);
        }

    }
}
