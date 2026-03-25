package BaekJoonAlgorithm.Re_silver.level2;

import java.util.Arrays;
import java.util.Scanner;

public class 베르트랑공준 {

  static int n = 123456*2 + 1;
  static boolean[] prime = new boolean[n];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    prime();

    StringBuilder sb = new StringBuilder();
    while (true){
      int value = sc.nextInt();
      if(value==0){
        break;
      }
      int count = 0;
      for(int i =value+1; i<=value*2;i++){
        if (prime[i]){
          count++;
        }
      }
      sb.append(count).append("\n");
    }

    System.out.println(sb);
  }

  static void prime(){
    Arrays.fill(prime, true);
    prime[0] = prime[1] = false;

    for(int i = 2; i*i<n;i++){
      if(prime[i]){
        for(int j = i*i; j<n;j+=i){
          prime[j] = false;
        }
      }
    }
  }
}
