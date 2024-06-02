package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1149
/**
 * 내려 가기 문제랑 비슷하다. 패딩 행을 생성해 각 열마다 이전 열의 선택한 색상을 제외하고 모두 더핵 각 색상의 집외 최솟값을 구하면된다.
 */
public class RGB거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int R = 0;
        final int G = 1;
        final int B = 2;

        int[][] RGB = new int[n+1][5];

        for(int i = 1;i<=n;i++){
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();
            RGB[i][R] = Math.min(RGB[i-1][B] , RGB[i-1][G]) + r;
            RGB[i][G] = Math.min(RGB[i-1][B] , RGB[i-1][R]) + g;
            RGB[i][B] = Math.min(RGB[i-1][R] , RGB[i-1][G]) + b;
        }
        System.out.println( Math.min(RGB[n][R],Math.min(RGB[n][B], RGB[n][G])));
    }
}
