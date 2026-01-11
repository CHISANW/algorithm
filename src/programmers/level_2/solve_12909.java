package programmers.level_2;


import java.util.Arrays;
import java.util.Stack;

public class solve_12909 {
    public static void main(String[] args) {
        boolean solution1 = solution("()()");
        boolean solution2 = solution("(())()");
        boolean solution3 = solution(")()(");
        boolean solution4 = solution("(()(");

        System.out.println(solution1);
        System.out.println(solution2);
        System.out.println(solution3);
        System.out.println(solution4);

    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
