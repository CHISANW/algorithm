package BaekJoonAlgorithm.재귀호출;

import java.util.*;

public class 연산자끼워넣기 {
    static final int PLUS = 0;
    static final int MINUS = 1;
    static final int MUL = 2;
    static final int DIV = 3;

    static int n;
    static int[] numbers;
    static int[] operator = new int[4];
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        numbers = new int[n];

        for (int i =0;i<n;i++){
            numbers[i] = sc.nextInt();
        }

        for (int i =0;i<4;i++){
            operator[i]=  sc.nextInt();
        }
        solve(1,numbers[0]);
        System.out.println(MAX);
        System.out.println(MIN);

    }

    static void solve(int index, int sum){
        //basecase
        if (index==n){
            if (sum<MIN) MIN= sum;
            if (sum>MAX) MAX = sum;
            return;
        }

        //recursive case
        for (int i =0;i<4;i++){
            if (operator[i]>0) {
                operator[i]--;
                switch (i) {
                    case PLUS:
                        solve(index + 1, sum+numbers[index]);
                        break;
                    case MINUS:
                        solve(index + 1, sum-numbers[index]);
                        break;
                    case MUL:
                        solve(index + 1, sum*numbers[index]);
                        break;
                    case DIV:
                        solve(index + 1, sum/numbers[index]);
                        break;
                }
                operator[i]++;
            }
        }

    }
}
