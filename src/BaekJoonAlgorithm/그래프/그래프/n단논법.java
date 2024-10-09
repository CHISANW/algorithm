package BaekJoonAlgorithm.그래프.그래프;

import java.util.*;
import java.io.*;

public class n단논법 {
    static List<Integer>[] graph = new List[26];
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());

        for (int i =0; i<26;i++){
            graph[i] = new ArrayList<>();
        }

        for (int i =0; i<n;i++){
            String[] parts = br.readLine().split(" ");
            int to = parts[0].charAt(0)-'a';
            int from = parts[2].charAt(0)-'a';
            graph[to].add(from);
        }


        int m = Integer.parseInt(br.readLine());

        for (int i =0; i<m;i++){
            String line = br.readLine();
            String[] parts = line.split(" ");
            int to = parts[0].charAt(0)-'a';
            int from = parts[2].charAt(0)-'a';
            visited = new boolean[26];
            boolean bfs = bfs(to, from);
            System.out.println(bfs ? "T" : "F");
        }

    }

    static boolean bfs(int to, int from){

        Queue<Integer> q= new LinkedList<>();
        q.add(to);
        visited[to] = true;

        while (!q.isEmpty()){
            Integer now = q.poll();
            if (now == from){
                return true;
            }
            for (Integer i : graph[now]) {
                if (!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }

        }
        return false;
    }
}
