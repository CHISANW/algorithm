package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_3135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int minPress = Math.abs(a-b);

        for(int i = 0; i<n;i++){
            int farthest = sc.nextInt();
            minPress = Math.min(minPress, 1+Math.abs(farthest-b));
        }

        System.out.println(minPress);
    }
}
