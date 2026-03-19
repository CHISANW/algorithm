package BaekJoonAlgorithm.Re_silver.level1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 숨바꼭질 {
  static int[] jump = {-1,1,2};
  static boolean[] visited;
  static int n , m;
  static int min = Integer.MAX_VALUE;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    visited = new boolean[100001];
    bfs();
    System.out.println(min);
  }


  static void bfs(){
    visited[n] = true;
    Queue<Point> q = new LinkedList<>();

    q.add(new Point(n,0));

    while (!q.isEmpty()){
      Point now = q.poll();
      if(now.index == m){
        min =now.value;
        return;
      }

      for(int i =0; i<3;i++){
        int nr = now.index;
        if(i==2){
          nr *= jump[i];
        }else{
          nr += jump[i];
        }

        if(isNext(nr) && !visited[nr]){
          visited[nr] = true;
          q.add(new Point(nr, now.value+1));
        }
      }
    }

  }

  static class Point{
    int index, value;

    public Point(int index, int value) {
      this.index = index;
      this.value = value;
    }
  }
  static boolean isNext(int x) {
    return x >= 0 && x <= 100000;
  }
}
