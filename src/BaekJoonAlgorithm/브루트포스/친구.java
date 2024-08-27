package BaekJoonAlgorithm.브루트포스;

import java.util.*;

public class 친구 {
    static int[][] arr;
    static int INF = Integer.MAX_VALUE/2;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new int[n][n];

        for (int i =0; i<n;i++){
            char[] line = sc.next().toCharArray();
            for (int j = 0; j<line.length;j++){
                if (line[j] == 'Y')
                    arr[i][j] = 1;
                else arr[i][j] = INF;
            }
        }

        for (int i =0; i<n;i++){    // 출발지
            for (int j =0; j<n;j++){    // 경우지
                for (int k =0; k<n;k++){    // 도착지
                    arr[i][j] = Math.min(arr[i][k] + arr[k][j], arr[i][j]);
                }
            }
        }

        int maxCount =0;
        for (int i =0; i<n;i++){
            int cnt = 0;
            for (int j =0; j<n;j++){
                if (i==j) continue;;
                if (0<arr[i][j] && arr[i][j] <=2){
                    cnt++;
                }
            }
            maxCount = Math.max(cnt,maxCount);
        }

        System.out.println(maxCount);
    }
}
