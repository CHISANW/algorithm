package BaekJoonAlgorithm.수학;

import java.util.Scanner;

public class 카잉달력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int lcm = lcm(m,n);

            int answer = -1;
            for (int k = x; k <= lcm; k += m) {
                if ((k - 1) % n + 1 == y) {
                    answer = k;
                    break;
                }
            }

            System.out.println(answer);
        }
    }

    static int lcm(int a, int b){
        return a * (b / gcd(a,b));
    }


    static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

}