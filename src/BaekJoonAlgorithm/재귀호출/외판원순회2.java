package BaekJoonAlgorithm.재귀호출;

import java.util.*;
public class 외판원순회2 {
    static int N;
    static int answer = Integer.MAX_VALUE;
    static int[][] w;
    static boolean[] check;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        w = new int[N][N];
        check = new boolean[N];

        for (int i =0;i<N;i++){
            for (int j =0;j<N;j++){
                w[i][j] = sc.nextInt();
            }
        }
        travel(0,0,0,0);
        System.out.println(answer);
    }


    static void travel(int start ,int node, int sum, int count){
        if (start==node && count==N){
            answer = Math.min(sum,answer);
            return;
        }

        for (int i =0;i<N;i++){
            if (w[node][i]!=0 && !check[i]){
                check[i] = true;
                travel(start,i,sum+w[node][i],count+1);
                check[i] = false;
            }
        }
    }
}
