package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 1 , end= 1, sum = 1, count =0;

        while (start <= n){
            if(sum ==n) count++;

            if(sum>n){
                sum -= start;
                start++;
            }else{
                end++;
                sum += end;
            }
        }
        System.out.println(count);


    }
}
