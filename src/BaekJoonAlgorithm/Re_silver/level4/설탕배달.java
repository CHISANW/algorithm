package BaekJoonAlgorithm.Re_silver.level4;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        count += n/5;
        n%=5;

        while (n%3 !=0 && count > 0){
            n += 5;
            count--;
        }

        if(n%3 ==0){
            count += n/3;
        }else{
            count = -1;
        }

        System.out.println(count);


    }
}
