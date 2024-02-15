package BaekJoonAlgorithm.조건문;

import java.util.Scanner;

public class 두수비교하기 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        if (a<b)
            System.out.println("<");
        if(a>b)
            System.out.println(">");
        if (a==b)
            System.out.println("==");
    }

}
