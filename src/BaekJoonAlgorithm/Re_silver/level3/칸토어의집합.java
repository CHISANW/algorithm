package BaekJoonAlgorithm.Re_silver.level3;

import java.io.*;

public class 칸토어의집합 {

  static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line;
    while ((line = br.readLine()) != null) {
      int n = Integer.parseInt(line);
      cantor(n);
      sb.append("\n");
    }

    System.out.print(sb);
  }

  static void cantor(int n) {
    if (n == 0) {
      sb.append("-");
      return;
    }

    cantor(n - 1);

    int len = (int) Math.pow(3, n - 1);
    for (int i = 0; i < len; i++) {
      sb.append(" ");
    }

    cantor(n - 1);
  }

}
