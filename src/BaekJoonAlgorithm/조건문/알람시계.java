package BaekJoonAlgorithm.조건문;

import java.util.Scanner;

/**
 *문제번호 2884번
 */
public class 알람시계 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        int h = a;
        int m = (b-45);

        if (m <0){
            h = a-1;
            m= m+60;
            if (h<0)
                h=23;
            System.out.println(h);
            System.out.println(m);
        } else if (m>0) {
            h=a;
            System.out.println(h);
            System.out.println(m);
        }else if (m == 0) {
            System.out.println(h);
            System.out.println(m);
        }

    }
}
