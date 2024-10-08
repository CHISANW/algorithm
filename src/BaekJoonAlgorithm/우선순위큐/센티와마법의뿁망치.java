package BaekJoonAlgorithm.우선순위큐;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 센티와마법의뿁망치 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        String answer = "NO";
        for (int i =0; i<n;i++){
            q.add(Integer.parseInt(br.readLine()));
        }
        int count = 0;

        for (int i =0; i<k; i++){
            if ((q.peek()<h) || (q.peek()==1)) break;

            count++;
            q.add(q.poll()/2);
        }


        if (q.peek()<h) answer = "YES";
        StringBuilder sb = new StringBuilder(answer);
        sb.append("\n").append(answer.equals("YES") ? count : q.poll());
        System.out.print(sb);

    }
}
