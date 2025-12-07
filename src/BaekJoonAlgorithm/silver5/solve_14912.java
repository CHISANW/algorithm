package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_14912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();


        int count = 0;
        char target = (char) (d+'0');
        for(int i = 1 ; i<=n;i++){
            String s = String.valueOf(i);
            for(int j =0; j<s.length();j++){
                if(s.charAt(j) == target){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
