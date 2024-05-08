package BaekJoonAlgorithm.트리;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 트리와쿼리 {
    static List<Integer>[] tree;
    static int[] sum;
    static boolean[] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();
        int Q = sc.nextInt();

        tree = new ArrayList[N+1];
        sum = new int[N+1];
        check = new boolean[N+1];

        for (int i =0;i<N+1;i++)
            tree[i] = new ArrayList<>();


        for (int i =0;i<N-1;i++){
            int node1 = sc.nextInt();
            int node2 = sc.nextInt();

            tree[node1].add(node2);
            tree[node2].add(node1);
        }

        sum[R] = getSum(R);

        for (int i=0;i<Q;i++){
            int q = sc.nextInt();
            System.out.println(sum[q]);
        }

    }

    public static int getSum(int node){
        if (sum[node] != 0) return sum[node];       //합이 있다면 반환 (메모리)
        check[node]= true;
        int result = 1;

        for (int child : tree[node]){       //해당 노드의 하위의 합
            if (!check[child]){
                result += getSum(child);
            }
        }

        return sum[node] = result;
    }
}
