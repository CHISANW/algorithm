package BaekJoonAlgorithm.Re_silver.level1;

import java.util.Scanner;

public class 스타트와링크 {
  static int[][] team;
  static int n;
  static boolean[] check;
  static int min = Integer.MAX_VALUE;


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    team = new int[n+1][n+1];
    check = new boolean[n+1];

    for(int i =1; i<=n;i++){
      for(int j =1; j<=n;j++){
        team[i][j] = sc.nextInt();
      }
    }

    solve(0,1);
    System.out.println(min);

  }

  static void solve(int dep, int start){
    if(n/2 == dep){
      min = Math.min(min, getResult());
      return;
    }

    for (int i =start;i<=n;i++){
      check[i] = true;
      solve(dep+1, i+1);
      check[i] = false;
    }
  }

  static int getResult(){
    int start = 0;
    int link = 0;

    for(int i =1; i<=n;i++) {
      for (int j = 1; j<=n;j++){
        if(i == j ) continue;
        if(check[i] && check[j]) start+=team[i][j];
        if(check[i] || check[j]) link+=team[i][j];
      }

    }
    return Math.abs(start - link);
  }

}
