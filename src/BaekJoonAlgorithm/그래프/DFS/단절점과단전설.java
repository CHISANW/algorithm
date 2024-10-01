package BaekJoonAlgorithm.그래프.DFS;

import java.io.*;
import java.util.*;

public class 단절점과단전설 {
    static List<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        tree = new List[n+1];

        for (int i =0; i<=n;i++){
            tree[i] = new ArrayList<>();
        }

        for (int i =0; i<n-1;i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end =Integer.parseInt(st.nextToken());

            tree[start].add(end);
            tree[end].add(start);
        }

        int q = Integer.parseInt(br.readLine());

        for (int i =0; i<q;i++){
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if (t == 2){
                sb.append("yes").append("\n");
            }else{
                if (tree[k].size()>=2){
                    sb.append("yes").append("\n");
                }else
                    sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
    }
}