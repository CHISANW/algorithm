package BaekJoonAlgorithm.스택큐덱.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 문제번호 12789번
 * 스택을 이용한문제
 */
public class 도키도키간식드리미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int peek = 1;

        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            stack.push(a);

            while (!stack.isEmpty() && stack.peek() == peek) {
                stack.pop();
                peek++;
            }
        }

        if (stack.isEmpty()) {
            sb.append("Nice");
        } else {
            sb.append("Sad");
        }

        System.out.println(sb);
        br.close();
    }
}
