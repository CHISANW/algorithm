package BaekJoonAlgorithm.트리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 회사문화 {
    static int[] parent;
    static int[] like;
    static List<Integer>[] tree;

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        tree = new ArrayList[n+1];
        like = new int[n+1];
        parent = new int[n+1];

        for (int i=1;i<=n;i++){
            tree[i] = new ArrayList<>();
            parent[i] = sc.nextInt();
            if (parent[i]!=-1) {
                tree[parent[i]].add(i);
            }
        }

        for (int i=0;i<m;i++){
            int employee = sc.nextInt();
            int point = sc.nextInt();
            like[employee] += point;
        }

        next(1);
        for (int i =1;i<=n;i++){
            System.out.print(like[i]+" ");
        }
        System.out.println();
    }

    public static void next(int node){
        for (int child : tree[node]){
            like[child] += like[node];
            next(child);
        }
    }
}
