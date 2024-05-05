package BaekJoonAlgorithm.스택큐덱.스택;

import java.io.*;

public class 스택 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] stack = new int[N];
        int stackIndex = -1;
        while (N-- > 0){
            String[] cmd = br.readLine().split(" ");

            if (cmd[0].equals("push")){
               stack[++stackIndex] = Integer.parseInt(cmd[1]);
            } else if (cmd[0].equals("pop")) {
                sb.append(stackIndex<0 ? "-1\n" : stack[stackIndex--]+"\n");
            } else if (cmd[0].equals("size")) {
                sb.append(stackIndex+1+"\n");
            } else if (cmd[0].equals("empty")) {
             sb.append(stackIndex == -1 ? "1\n":"0\n");
            } else if (cmd[0].equals("top")) {
                sb.append(stackIndex<0 ? "-1\n": stack[stackIndex]+"\n");
            }
        }

        System.out.println(sb);
    }
}
