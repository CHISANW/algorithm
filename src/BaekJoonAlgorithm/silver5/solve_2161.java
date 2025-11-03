package BaekJoonAlgorithm.silver5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class solve_2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i =1; i<=n;i++){
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();

        while (q.size() > 1){
            Integer poll = q.poll();
            Integer poll1 = q.poll();
            sb.append(poll).append(" ");
            q.add(poll1);
        }
        sb.append(q.poll());
        System.out.println(sb);

    }
}
