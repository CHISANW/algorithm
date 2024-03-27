package BaekJoonAlgorithm.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 문제번호 10773번
 * 간단한 스택문제
 */
public class 제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i =0; i<n;i++){
            int request = Integer.parseInt(br.readLine());
            if (request==0){
                stack.pop();
            }else
                stack.push(request);
        }
        for (Integer integer : stack) {
            sum+=integer;
        }

        System.out.println(sum);
    }
}
