package BaekJoonAlgorithm.Re_silver.level3;

import java.util.Scanner;

public class 선물 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    long l = sc.nextLong();
    long w = sc.nextLong();
    long h = sc.nextLong();

    double left = 0;
    double right = Math.min(l, Math.min(w, h));

    for(int i =0; i<=100;i++){
      double mid = (left+right)/2;

      long count = (long)(l/mid) * (long)(w/mid) * (long)(h/mid);

      if(count >= n){
        left = mid;
      }else{
        right = mid;
      }
    }

    System.out.println(left);

  }

}
