package BaekJoonAlgorithm.Re_silver.level3;

import java.util.Scanner;

public class N과M_1 {
  static int n,m;
  static int[] numbers;
  static int[] output;
  static boolean[] visited;
  static StringBuilder sb = new StringBuilder();
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();

    output = new int[m];
    visited = new boolean[n];
    dfs(0);
    System.out.println(sb);
  }

  static void dfs(int depth) {
    if (depth == m) {
      for (int i = 0; i <m; i++) {
        sb.append(output[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for(int i = 0; i<n;i++){
      if(!visited[i]){
        visited[i] = true;
        output[depth] = i+1;
        dfs(depth+1);
        visited[i] = false;
      }
    }
  }

}
