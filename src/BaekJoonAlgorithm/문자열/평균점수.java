package BaekJoonAlgorithm.문자열;

import java.util.Scanner;

public class 평균점수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i= 0;i<5;i++){
            int a = sc.nextInt();
            if (a<40){
                a=40;
            }
            sum+=a;
        }
        System.out.println(sum/5);
    }
}
