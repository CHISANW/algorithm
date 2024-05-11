package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 부녀회장이될테야 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int[][] apt = new int[a+1][b+1];

            for (int i =1;i<=b;i++){
                apt[0][i] = i;
            }

            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
                }
            }

            System.out.println(apt[a][b]);


        }
    }
}
