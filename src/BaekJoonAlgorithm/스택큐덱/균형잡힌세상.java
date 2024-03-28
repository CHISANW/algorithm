package BaekJoonAlgorithm.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while ((str = br.readLine()) != null) {
            Stack<Character> stack = new Stack<>();

            if (str.equals(".")) break; // 입력 종료 조건

            boolean balanced = true; // 균형 여부를 저장하는 변수

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')' || c == ']') {
                    if (stack.isEmpty()) {
                        balanced = false; // 스택이 비어있으면 균형이 깨짐
                        break;
                    }

                    char top = stack.pop(); // 스택에서 꺼내온 괄호
                    if ((c == ')' && top != '(') || (c == ']' && top != '[')) {
                        balanced = false; // 짝이 맞지 않는 괄호가 나옴
                        break;
                    }
                }
            }

            if (!stack.isEmpty()) balanced = false; // 스택에 여는 괄호가 남아있으면 균형이 깨짐

            sb.append(balanced ? "yes\n" : "no\n");
        }

        System.out.println(sb);
        br.close();
    }
}
