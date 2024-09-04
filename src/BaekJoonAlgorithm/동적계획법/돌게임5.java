package BaekJoonAlgorithm.동적계획법;

import java.util.Scanner;

public class 돌게임5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n%2!=1){
            System.out.println("CY");
        }else
            System.out.println("SK");
    }
}
