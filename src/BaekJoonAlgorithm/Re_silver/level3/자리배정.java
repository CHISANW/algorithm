package BaekJoonAlgorithm.Re_silver.level3;

import java.util.*;
import java.io.*;

public class 자리배정 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int C = Integer.parseInt(st.nextToken()); // 가로
    int R = Integer.parseInt(st.nextToken()); // 세로

    int K = Integer.parseInt(br.readLine());

    if(K > C * R){
      System.out.println(0);
      return;
    }

    boolean[][] visited = new boolean[R][C];

    // ↑ → ↓ ←
    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    int x = 0, y = 0;
    int dir = 0;

    for(int i =1; i<=K;i++){
      if( i == K){
        System.out.println((x+1) + " " + (y+1));
        return;
      }
      visited[y][x] = true;

      int nx = x + dx[dir];
      int ny = y + dy[dir];

      if (nx < 0 || ny < 0 || nx >= C || ny >= R || visited[ny][nx]) {
        dir = (dir + 1) % 4;
        nx = x + dx[dir];
        ny = y + dy[dir];
      }
      x = nx;
      y = ny;

    }
  }

}
