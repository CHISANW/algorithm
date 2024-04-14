package BaekJoonAlgorithm.브루트포스;

import java.util.Scanner;

public class ACM호텔 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int t = stdIn.nextInt();

        while (t-- >0){
            int h = stdIn.nextInt();
            int w = stdIn.nextInt();
            int n = stdIn.nextInt();

            int distance = (n-1)/h+1;
            int floor = (n-1)%h+1;

            System.out.printf("%d%02d\n",floor,distance);
        }
    }
}
