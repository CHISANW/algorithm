package BaekJoonAlgorithm.스택큐덱.큐;

import java.io.*;
import java.util.*;

public class 요세푸스_큐 {

    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int K = stdIn.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            q.add(i);

        int[] ans = new int[N];
        for (int i =0;i<N;i++){
            for (int j=1; j<K;j++){
                q.add(q.poll());
            }
            ans[i] = q.poll();
         }

        System.out.print("<");
        for (int i =0;i<N-1;i++)
            System.out.print(ans[i]+", ");
        System.out.println(ans[ans.length-1]+">");
    }
}
