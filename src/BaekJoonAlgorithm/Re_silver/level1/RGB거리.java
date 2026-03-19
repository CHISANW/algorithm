package BaekJoonAlgorithm.Re_silver.level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    final int R = 0;
    final int G = 1;
    final int B = 2;

    int[][] RGB = new int[n+1][5];

    for(int i = 1;i<=n;i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int r = Integer.parseInt(st.nextToken());
      int g = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      RGB[i][R] = Math.min(RGB[i-1][B] , RGB[i-1][G]) + r;
      RGB[i][G] = Math.min(RGB[i-1][B] , RGB[i-1][R]) + g;
      RGB[i][B] = Math.min(RGB[i-1][R] , RGB[i-1][G]) + b;
    }

    System.out.println(Math.min(RGB[n][R],Math.min(RGB[n][B], RGB[n][G])));

  }

}
