package BaekJoonAlgorithm.스택큐덱.덱;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class AC {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st ;
        while (T-- >0){
            char[] p = br.readLine().toCharArray();
            Deque<Integer> dq = new LinkedList<>();

            int n = Integer.parseInt(br.readLine());

            String len = br.readLine().replace("[", "").replace("]", "");

            st= new StringTokenizer(len, ",");

            for (int i =0;i<n;i++){
                dq.addLast(Integer.parseInt(st.nextToken()));
            }

            boolean isFliapped = false;
            boolean isValid = true;

            for (char c : p){
                if (c=='D'){
                    if (dq.isEmpty()){
                        isValid = false;
                        break;
                    }
                    if (isFliapped) dq.pollLast();
                    else dq.pollFirst();
                }else
                    isFliapped = !isFliapped;
            }

            if (isValid){
                StringBuilder sb = new StringBuilder();
                while (!dq.isEmpty()){
                    sb.append(isFliapped ? dq.pollLast(): dq.pollFirst());
                    if (!dq.isEmpty()) sb.append(",");
                }
                System.out.println("["+sb+"]");
            }else
                System.out.println("error");

        }
    }
}
