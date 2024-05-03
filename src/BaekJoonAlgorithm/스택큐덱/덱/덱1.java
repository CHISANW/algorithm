package BaekJoonAlgorithm.스택큐덱.덱;

import java.util.*;
import java.io.*;

public class 덱1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new LinkedList<>();
        while(N-->0){

            String[] cmd = br.readLine().split(" ");

            if (cmd[0].equals("push_front")){
                dq.addFirst(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("push_back")) {
                dq.addLast(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("pop_front")) {
                sb.append(dq.isEmpty() ? "-1\n" : dq.removeFirst()+"\n");
            } else if (cmd[0].equals("pop_back")) {
                sb.append(dq.isEmpty() ? "-1\n": dq.removeLast()+"\n");
            } else if (cmd[0].equals("size")) {
                sb.append(dq.size()+"\n");
            } else if (cmd[0].equals("empty")) {
                sb.append(dq.isEmpty()?"1\n":"0\n");
            } else if (cmd[0].equals("front")) {
                sb.append(dq.isEmpty() ? "-1\n":dq.getFirst()+"\n");
            } else if (cmd[0].equals("back")) {
                sb.append(dq.isEmpty() ? "-1\n":dq.getLast()+"\n");
            }
        }

        System.out.println(sb);
    }
}
