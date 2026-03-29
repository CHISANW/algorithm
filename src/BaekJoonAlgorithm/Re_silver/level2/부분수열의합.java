package BaekJoonAlgorithm.Re_silver.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분수열의합 {

  static int ans = 0;
  static int n , s;
  static int[] arr;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    s = Integer.parseInt(st.nextToken());

    arr = new int[n];


    st = new StringTokenizer(br.readLine());
    for(int i =0; i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    backtracking(0, 0);
    System.out.println(ans);

  }

  static void backtracking(int deep, int sum){
    if(deep == n){
      return;
    }

    if(sum +arr[deep] == s){
      ans++;
    }

    backtracking(deep+1, sum);
    backtracking(deep+1, sum+arr[deep]);
  }

}
