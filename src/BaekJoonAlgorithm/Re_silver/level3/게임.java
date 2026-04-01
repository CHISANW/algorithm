package BaekJoonAlgorithm.Re_silver.level3;

import java.util.Scanner;

public class 게임 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();


    long z = (y*100) / x;


    if(z >= 99){
      System.out.println(-1);
      return;
    }


    long left = 1;
    long right = Integer.MAX_VALUE;
    long answer = -1;

    while (left <= right){
      long mid = (left + right)/2;

      long newZ = ((y + mid) * 100) / (x + mid);
      if(newZ > z){
        answer = mid;
        right = mid-1;
      }else{
        left = mid + 1;
      }
    }


    System.out.println(answer);
  }

}
