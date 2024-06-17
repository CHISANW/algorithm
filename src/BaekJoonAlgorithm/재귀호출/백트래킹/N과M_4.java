package BaekJoonAlgorithm.재귀호출.백트래킹;

import java.util.Scanner;

public class N과M_4 {
    static int[] numbers;
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        numbers = new int[m];

        dfs(0,1);
        System.out.println(sb);
    }

    static void dfs(int depth, int start){
        if(depth==m){
            for(int number : numbers){
                sb.append(number).append(' ');
            }
            sb.append("\n");
            return;
        }

        for(int i = start;i<=n;i++){
            numbers[depth] = i;
            dfs(depth+1,i);
        }
    }
}
