package BaekJoonAlgorithm.Re_silver.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 골드바흐파티션 {
  static int index = 1000000;
  static boolean[] primes = new boolean[1000001];

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    isPrime();

    String line = br.readLine();

    while ((line = br.readLine()) != null){
      if (line.trim().isEmpty()) continue;

      int n = Integer.parseInt(line);
      int count = 0;

      for(int i = 2;i<=n / 2;i++){
        if(primes[i] && primes[n-i]){
          count++;
        }
      }
      System.out.println(count);
    }
  }


  static void isPrime(){
    Arrays.fill(primes, true);

    primes[0] = false;
    primes[1] = false;

    for(int i= 2; i*i <=index;i++){
      if(primes[i]){
        for(int j = i*i; j<=index;j+=i){
          primes[j] = false;
        }
      }
    }
  }
}
