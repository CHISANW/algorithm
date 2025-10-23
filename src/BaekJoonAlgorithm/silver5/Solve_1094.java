package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class Solve_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        String string = Integer.toBinaryString(value);
        int count = 0;
        for(char c: string.toCharArray()){
            if(c=='1') count++;
        }
        System.out.println(count);
    }
}
