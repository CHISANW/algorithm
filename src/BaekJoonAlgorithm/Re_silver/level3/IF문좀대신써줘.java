package BaekJoonAlgorithm.Re_silver.level3;

import java.io.*;
import java.util.StringTokenizer;

public class IF문좀대신써줘 {

  static int[] power;
  static String[] name;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    power = new int[n];
    name = new String[n];

    for(int i =0; i<n;i++){
      st = new StringTokenizer(br.readLine());
      name[i] = st.nextToken();
      power[i] = Integer.parseInt(st.nextToken());
    }

    for(int i =0; i<m;i++){
      int p = Integer.parseInt(br.readLine());
      int index = binarySearch(p);
      sb.append(name[index]).append("\n");
    }
    System.out.println(sb);

  }

  static int binarySearch(int target){
    int left = 0;
    int right = power.length-1;

    while (left <= right){
      int mid = (left + right)/2;

      if(target <= power[mid]){
        right = mid -1;
      }else{
        left = mid +1;
      }
    }
    return left;
  }

}
