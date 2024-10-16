package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 아주간단한문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int q = sc.nextInt();

        while (q-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (b%a ==0 && b/a >=2){
                sb.append(1).append("\n");
            }else
                sb.append(0).append("\n");
        }

        System.out.println(sb);
    }
}
