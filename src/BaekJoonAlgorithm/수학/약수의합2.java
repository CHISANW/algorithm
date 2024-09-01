package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 약수의합2 {
    public static void main(String[] args) {
        int n;
        long res = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i =1; i<=n;i++){
            res+= i * (n/i);
        }
        System.out.println(res);
    }
}
