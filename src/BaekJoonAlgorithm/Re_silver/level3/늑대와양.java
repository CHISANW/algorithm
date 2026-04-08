package BaekJoonAlgorithm.Re_silver.level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 늑대와양 {
  static char[][] map;
  static int[] dr = {-1, 1, 0, 0};
  static int[] dc = {0, 0, -1, 1};
  static int r,c;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    r = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());

    map = new char[r][c];

    for(int i =0; i<r;i++){
      String line = br.readLine();
      for(int j =0; j<c;j++){
        map[i][j] = line.charAt(j);
      }
    }

    for(int i =0; i< r;i++){
      for(int j =0; j<c;j++){
        if(map[i][j] == 'W'){
          for(int d =0; d<4;d++){
            int nx = i + dr[d];
            int ny = j + dc[d];
            if (nx < 0 || ny < 0 || nx >= r || ny >= c) continue;
            if(map[nx][ny] == 'S'){
              System.out.println('0');
              return;
            }
          }
        }
      }
    }

    System.out.println(1);

    for(int i =0; i< r;i++){
      for(int j =0; j<c;j++){
        if(map[i][j] =='.'){
          map[i][j] = 'D';
        }
        System.out.print(map[i][j]);
      }
      System.out.println();
    }
  }

}
