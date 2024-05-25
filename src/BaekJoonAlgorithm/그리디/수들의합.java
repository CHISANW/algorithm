package BaekJoonAlgorithm.그리디;

import java.util.Scanner;

public class 수들의합 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();
        long sum =0;
        long count =0;

        for(long i =1; ;i++){
            sum += i;
            count++;
            if(sum>s){
                break;
            }
        }
        System.out.println(count -1);
    }
}
