package BaekJoonAlgorithm.구현;

import java.util.*;

public class 분산처리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();

         while (T-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
             int result = 1;
             for(int j = 0; j < b; j++) {
                 result = (result * a) % 10;
             }
             if(result == 0) {
                 System.out.println(10);
             }else {
                 System.out.println(result);
             }

        }
    }
}
