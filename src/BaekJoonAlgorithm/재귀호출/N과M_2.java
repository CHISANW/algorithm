package BaekJoonAlgorithm.재귀호출;

import java.util.Scanner;

public class N과M_2 {
    static boolean[] visited;
    static int[] numbers;
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();       // 3
        m = sc.nextInt();       // 1
        visited = new boolean[n];
        numbers = new int[m];

        dfs(0,0);
        System.out.println(sb);
    }

    static void dfs(int depth, int start){ // start 파라미터 추가
        if(depth==m){
            for(int i = 0;i <m;i++)
                sb.append(numbers[i]+" ");
            sb.append("\n");
            return;
        }

        for (int i = start;i<n;i++){ // 이전에 선택한 숫자 이후부터 반복
            if(!visited[i]){
                visited[i] =true;
                numbers[depth] = i+1;
                dfs(depth+1, i+1); // 다음 숫자 선택 시, 현재 숫자 이후부터 시작하도록 start 파라미터 전달
                visited[i] =false;
            }
        }
    }
}
