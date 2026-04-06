package BaekJoonAlgorithm.Re_silver.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로또 {

  static StringBuilder sb = new StringBuilder();
  static int[] arr;
  static int[] result;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken());
      if(n == 0) break;

      arr = new int[n];
      result = new int[6];
      for(int i =0; i<n;i++){
        arr[i] = Integer.parseInt(st.nextToken());
      }

      backtracking(0, 0);
      sb.append("\n");
    }
    System.out.println(sb);
  }

  static void backtracking(int start, int depth){
    if(depth == 6){
      for (int i = 0; i<6;i++){
        sb.append(result[i]).append(" ");
      }
      sb.append("\n");
      return;
    }

    for(int i = start; i<arr.length;i++){
      result[depth] = arr[i];
      backtracking(i+1, depth+1);
    }

  }

}
