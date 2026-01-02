package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class solve_18115 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] ops = new int[n];
        StringTokenizer st = new StringTokenizer(new StringBuilder(br.readLine()).reverse().toString());
        for (int i = 0; i < n; i++) {
            ops[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 1; i<=n;i++){
            int op = ops[i - 1];
            if(op == 1){
                dq.addFirst(i);
            }else if(op == 2){
                Integer top = dq.removeFirst();
                dq.addFirst(i);
                dq.addFirst(top);
            }else{
                dq.addLast(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!dq.isEmpty()) {
            sb.append(dq.pollFirst()).append(" ");
        }

        System.out.println(sb);
    }
}
