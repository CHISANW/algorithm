package BaekJoonAlgorithm.Re_silver.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class 타일링_1793 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    BigInteger[] dp = new BigInteger[251];

    dp[0] = BigInteger.ONE;
    dp[1] = BigInteger.ONE;
    dp[2] = new BigInteger("3");

    for(int i =3; i<=250;i++){
      dp[i] = dp[i-1].add(dp[i-2].multiply(BigInteger.valueOf(2)));
    }

    String line;
    while ((line = br.readLine()) != null) {
      int n = Integer.parseInt(line.trim());
      System.out.println(dp[n]);
    }
  }

}
