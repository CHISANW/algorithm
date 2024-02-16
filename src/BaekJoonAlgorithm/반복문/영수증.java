package BaekJoonAlgorithm.반복문;

import java.util.Scanner;

/**
 * 문제번호 25304번
 */
public class 영수증 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s1 = stdIn.nextLine();
        int X = Integer.parseInt(s1);
        String s2 = stdIn.nextLine();
        int N = Integer.parseInt(s2);

        int[] result = new int[N];
        int sum = 0;

        for(int i=0;i<N;i++){
            String s = stdIn.nextLine();
            String[] split = s.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            result[i] = a*b;
        }

        for (int i = 0; i<N;i++)
            sum+=result[i];

        if (sum==X){
            System.out.println("YES");
        }else
            System.out.println("No");
    }
}
