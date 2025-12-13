package BaekJoonAlgorithm.silver4;

import java.util.Scanner;

public class solve_3036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first = sc.nextInt();
        for(int i =1; i<n;i++){
            int current = sc.nextInt();
            int gcd = gcd(first, current);
            System.out.println((first/gcd) + "/" + (current/gcd));
        }

    }

    public static int gcd(int a, int b){
        while (b!= 0){
            int r= a% b;
            a = b;
            b = r;
        }
        return a;
    }
}
