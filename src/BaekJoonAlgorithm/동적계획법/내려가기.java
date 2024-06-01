package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2096
/**
 * 해당 문제는 각 열의 대해 최댓값과 최솟값을 모두 더해서 출력하는 문제이다.
 * ex)
 * n =3 일떄
 * 1 2 3
 * 4 5 6
 * 4 9 0
 * -> 최대 경로는 [1][3] + [2][3] + [3][2] = 3+6+9 = 18이 되고
 * -> 최소 경로는 [1][1] + [2][2] + [3][3] = 1+5+0 = 6 이되서 출력이 18,6 이된다.
 *
 * 문제를 2차원 배열로 풀경우에는 메모리 초과가 발생한다 .그래서 1차원 배열로 풀이를 해야한다.
 * 점화식
 * max[j] = Math.max(max[j-1] ,Math.max(max[j] , max[j+1]);
 * min[j] = Math.min(min[j-1] ,Math.min(min[j] , min[j+1]);
 * 각 [1] [2] [3] 의 인덱스의 최댓값과 최솟값을 도출해내면 된다.
 */
public class 내려가기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] max = new int[5];
        int[] min = new int[5];
        int input = 0 ;
        int[] tmp_max = new int[5];
        int[] tmp_min = new int[5];

        max[0] = 0;
        max[4] = 0;
        min[0] =Integer.MAX_VALUE;
        min[4] =Integer.MAX_VALUE;


        for(int i = 1; i<=n;i++){
            for(int j =1;j<=3;j++){
                input = sc.nextInt();
                tmp_max[j] = input + Math.max(max[j-1],Math.max(max[j] , max[j+1]));
                tmp_min[j] = input + Math.min(min[j-1],Math.min(min[j] , min[j+1]));
            }

            for(int j = 1;j<=3;j++){
                max[j] = tmp_max[j];
                min[j] = tmp_min[j];
            }
        }
        int ans_max = Math.max(max[1],Math.max(max[2],max[3]));
        int ans_min = Math.min(min[1],Math.min(min[2],min[3]));

        System.out.println(ans_max +" " + ans_min);
    }
}
