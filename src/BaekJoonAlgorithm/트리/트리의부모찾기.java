package BaekJoonAlgorithm.트리;

import java.util.*;

public class 트리의부모찾기 {
    static List<Integer>[] tree;
    static int[] parents;
    static boolean[] check;

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        tree= new ArrayList[N+1];
        parents = new int[N+1];
        check = new boolean[N+1];

        for (int i =0;i<N+1;i++){
            tree[i] = new ArrayList<>();
        }

        for (int i =0;i<N-1;i++){
            int node1 = stdIn.nextInt();
            int node2 = stdIn.nextInt();

            tree[node1].add(node2);
            tree[node2].add(node1);
        }
        find(1);

        for (int i = 2;i<N+1;i++){
            System.out.println(parents[i]);
        }
    }

    static void find(int now_node){
        check[now_node] = true;
        for (int i =0;i<tree[now_node].size();i++) {
            int child = tree[now_node].get(i);
            if (!check[child]){
                parents[child] = now_node;
                find(child);
            }
        }
    }
}
