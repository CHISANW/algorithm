package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b= sc.nextInt();

        int round = 0;
        while (a!= b){
            a = (a+1)/ 2;
            b = (b+1) /2;
            round++;
        }

        System.out.println(round);
    }
}
