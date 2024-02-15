package BaekJoonAlgorithm.조건문;

import java.util.Scanner;

/**
 * 문제번호 2480번
 */
public class 주사위세개 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.nextLine();

        String[] numbers= s.split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        int result = 0;
        if (a==c&&b==c){
            result = 10000+(a*1000);
        } else if (a == b||b==c|| a==c) {
            int same = (a==b) ?  a: c;
            result = 1000+(same*100);
        }else {
           int max= Math.max(Math.max(a,b),c);
           result = max * 100;
        }

        System.out.println(result);

    }
}
