package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class solve_11725 {
    static List<Integer>[] tree;
    static int[] parent;
    static boolean[] check;
    static int n;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n+1];
        parent = new int[n+1];
        check = new boolean[n+1];

        for(int i = 0; i<n+1;i++){
            tree[i] = new ArrayList<>();
        }


        for(int i = 0; i<n-1;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            tree[node1].add(node2);
            tree[node2].add(node1);
        }

        find(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }

    }

    static void find(int node){
        check[node] = true;

        for(int i =0; i<tree[node].size();i++){
            int child = tree[node].get(i);
            if(check[child])continue;
            parent[child] = node;
            find(child);
        }
    }
}
