package BaekJoonAlgorithm.스택큐덱.큐;

import java.io.*;
import java.util.*;

public class queuestack {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] queue = new int[n];
        int[] currentValue = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            queue[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            currentValue[i] = Integer.parseInt(st2.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        Deque<Integer> q = new ArrayDeque<>();
        for(int i =0;i<n;i++){
            if (queue[i] == 0){
                q.addFirst(currentValue[i]);
            }
        }

        int[] insertValue = new int[m];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<m;i++){
            insertValue[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0;i<m;i++){
            q.add(insertValue[i]);
            sb.append(q.pollFirst()+" ");
        }

        System.out.println(sb);

    }
}
