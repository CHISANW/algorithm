package BaekJoonAlgorithm.일차원배열;

import java.util.Scanner;


/**
 * 문제번호 2562번
 */
public class 최댓값 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int[] result =new int[9];

        for (int i=0;i<9;i++){
            result[i]= stdIn.nextInt();
        }
        int max = result[0];
        int line = 0;
        for (int i=0; i<result.length;i++){
            if (result[i]>max) {
                max = result[i];
                line = i;
            }
        }
        System.out.println(max);
        System.out.println(line+1);
    }
}
