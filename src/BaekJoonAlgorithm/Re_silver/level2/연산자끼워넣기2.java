package BaekJoonAlgorithm.Re_silver.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자끼워넣기2 {
  static int n;
  static int[] arr;
  static int[] operators;
  static int max =Integer.MIN_VALUE;
  static int min = Integer.MAX_VALUE;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    arr = new int[n];
    for(int i =0; i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    operators = new int[4];
    // [0] = +, [1] = -, [2] = *, [3] = /
    st = new StringTokenizer(br.readLine());
    for(int i =0; i<4;i++){
      operators[i] = Integer.parseInt(st.nextToken());
    }
    backtracking(0,arr[0]);
    System.out.println(max);
    System.out.println(min);
  }

  static void backtracking(int depth, int result) {
    if (depth == n - 1) {
      max = Math.max(max, result);
      min = Math.min(min, result);
      return;
    }

    for (int i = 0; i < 4; i++) {
      if (operators[i] > 0) {
        operators[i]--;

        int next = result;
        if (i == 0) next = result + arr[depth + 1];
        else if (i == 1) next = result - arr[depth + 1];
        else if (i == 2) next = result * arr[depth + 1];
        else
          next = result / arr[depth + 1];

        backtracking(depth + 1, next);

        operators[i]++;
      }
    }
  }

}
