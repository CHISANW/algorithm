package BaekJoonAlgorithm.자료구조;

import java.io.*;
import java.util.*;

public class 집합의표현 {
    static int[] parent;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =  new StringBuilder();
        StringTokenizer st;

        st= new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n+1];

        for (int i =0; i<=n;i++){
            parent[i]= i;
        }

        for (int i =0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (type == 0){
                union(a,b);
            }else{
                if (find(a) == find(b)){
                    sb.append("YES").append("\n");
                }else{
                    sb.append("NO").append("\n");
                }
            }
        }
        System.out.println(sb);
    }

    static int find(int a){
        if (parent[a] == a){
            return a;
        }

        return parent[a] = find(parent[a]);
    }
    static void union(int a, int b){
        int rootX = find(a);
        int rootY = find(b);

        if (rootX != rootY){
            if (rootX < rootY)
                parent[rootY] =rootX;
            else parent[rootX] =rootY;
        }
    }
}
