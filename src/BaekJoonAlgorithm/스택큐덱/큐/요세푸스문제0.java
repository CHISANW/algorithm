package BaekJoonAlgorithm.스택큐덱.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 문제번호 11866 큐를 이용한 요새푸스스 문제
 */
public class 요세푸스문제0 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] result = new int[n];
        int j = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1;i<=n;i++ ){
            queue.add(i);
        }

        while (!queue.isEmpty()){
            for (int i =1;i<=k;i++){
                if (i==k){
                    Integer poll = queue.poll();
                    result[j] = poll;
                    j++;
                }
                else {
                    Integer poll = queue.poll();
                    queue.add(poll);
                }
            }
        }
        System.out.print("<");
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[result.length - 1] + ">");
    }
}
