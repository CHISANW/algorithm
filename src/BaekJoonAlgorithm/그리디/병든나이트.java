package BaekJoonAlgorithm.그리디;

import java.util.Scanner;

public class 병든나이트 {
    static int n ,m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int answer = get();
        System.out.println(answer);

    }

    static int get(){

        if (n == 1) return 1;
        if (n == 2) return Math.min(4,(m+1)/2);
        if (m<7) return Math.min(4,m);
        return m-2;
    }
}
