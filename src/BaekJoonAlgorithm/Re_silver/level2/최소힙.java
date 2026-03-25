package BaekJoonAlgorithm.Re_silver.level2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class 최소힙 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1-o2);

    StringBuilder sb = new StringBuilder();
    for(int i=0; i<n;i++){
      int value = sc.nextInt();
      if(value ==0){
        if(pq.isEmpty()){
          sb.append(0).append("\n");
        }else{
          sb.append(pq.poll()).append("\n");
        }
      }else{
        pq.add(value);
      }
    }

    System.out.println(sb);
  }

}
