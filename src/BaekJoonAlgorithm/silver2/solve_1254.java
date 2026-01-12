package BaekJoonAlgorithm.silver2;

import java.util.Scanner;

public class solve_1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = str.length();

        for(int i = 0; i < n; i++){
            if(isPalindrome(str, i, n-1)){
                System.out.println(i + n);
                return;
            }
        }

    }

    static boolean isPalindrome(String str, int left, int right){
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
