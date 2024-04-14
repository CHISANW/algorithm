package BaekJoonAlgorithm.브루트포스;

import java.io.IOException;
import java.util.Scanner;

public class 희문인수 {

    public static void main(String[] args) throws IOException {

        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        while (n-- >0){
            int x = stdIn.nextInt();
            boolean ans = false;
            for (int i =2; i<=64;i++){
                int[] digit = convertBase(x,i);
                if (isPalindrome(digit)) {
                    ans= true;
                    break;
                }
            }
            System.out.println(ans?"1":"0");
        }
    }

    private static boolean isPalindrome(int[] digit) {

        for (int i =0;i<digit.length/2;i++){
            if (digit[i]!=digit[digit.length-i-1])
                return false;
        }
        return true;
    }

    private static int[] convertBase(int x, int b) {
        int copyX=x,length=0;

        while (copyX>0){
            copyX /=b;
            length++;
        }

        int[] digit = new int[length];
        length = 0;
        while (x>0){
            //진법 변환
            digit[length++] =x%b;
            x= x/b;
        }
        return digit;
    }
}
