package BaekJoonAlgorithm.Re_silver.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나무자르기 {
  static int[] arr;
  static int n,m;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    arr = new int[n];

    st = new StringTokenizer(br.readLine());
    for(int i =0; i<n;i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int start = 0;
    int end = 1000000000;
    int ans = -1;

    while (start <= end){
      int min = (end + start)/2;

      if(isPossible(min)){
        ans = min;
        start = min + 1;
      }else{
        end = min-1;
      }
    }

    System.out.println(ans);

  }

  static boolean isPossible(int current){
    long sum = 0;

    for(int i : arr){
      if(i > current){
        sum += i - current;
      }
    }
    return  sum >= m;
  }

}
