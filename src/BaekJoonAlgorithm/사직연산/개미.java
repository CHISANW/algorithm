package BaekJoonAlgorithm.사직연산;

import java.util.Scanner;

public class 개미 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int W = stdIn.nextInt();
        int H = stdIn.nextInt();
        int P = stdIn.nextInt();
        int Q = stdIn.nextInt();
        int T = stdIn.nextInt();

        int timeX = T%(2*W);
        int currentX = P;
        int deltaX = 1;
        while (timeX-- > 0){
            if (currentX == W) deltaX = -1;
            else if (currentX == 0) deltaX=1;
                currentX+=deltaX;
        }

        int timeY = T%(2*H);
        int currentY=Q;
        int deltaY= 1;
        while (timeY-- > 0){
            if (currentY==H) deltaY= -1;
            else if (currentY == 0) deltaY = 1;
            currentY+=deltaY;
        }
        System.out.println(currentX+" "+currentY);
    }
}
