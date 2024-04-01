package BaekJoonAlgorithm.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 문제번호 2164번 간단한 quere를 활용한문제
 */
public class 카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result= 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i= 1; i<=n;i++){
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            Integer a = queue.poll();
            if (queue.isEmpty()) {
                result = a;
            } else {
                Integer poll = queue.poll();
                queue.add(poll);
            }
        }
        System.out.println(result);
    }
}
