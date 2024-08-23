package BaekJoonAlgorithm.브루트포스;

import java.util.Scanner;

public class 도영이가만든맛있는음식 {
    static int n;
    static int[][] arr;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n][2];

        for(int i = 0; i<n;i++){
            int a = sc.nextInt();   // 신맛
            int b = sc.nextInt();   // 쓴맛

            arr[i][0] = a;
            arr[i][1] = b;
        }

        dfs(0, 1, 0, 0);
        System.out.println(min);

    }
    public static void dfs(int depth, int currentSour, int currentBitter, int chosenCount){
        if (depth == n){
            if (chosenCount>0){
                int diff = Math.abs(currentSour - currentBitter);
                min = Math.min(diff , min);
            }
            return;
        }

        // 현재 재료 선택
        dfs(depth+1, currentSour * arr[depth][0], currentBitter + arr[depth][1] , chosenCount+1);

        // 재료 선택하지 않았을 경우
        dfs(depth+1, currentSour, currentBitter,chosenCount);
    }
}
