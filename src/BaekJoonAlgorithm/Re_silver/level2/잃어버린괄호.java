package BaekJoonAlgorithm.Re_silver.level2;

import java.util.Scanner;

public class 잃어버린괄호 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    String[] parts = line.split("-");

    int result = 0;

// 첫 번째 덩어리
    String[] first = parts[0].split("\\+");
    for(String s : first){
      result += Integer.parseInt(s);
    }

// 나머지 덩어리
    for(int i = 1; i < parts.length; i++){
      int sum = 0;
      String[] tmp = parts[i].split("\\+");
      for(String s : tmp){
        sum += Integer.parseInt(s);
      }
      result -= sum;
    }

    System.out.println(result);

  }

}
