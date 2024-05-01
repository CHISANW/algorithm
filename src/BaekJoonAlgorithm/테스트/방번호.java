package BaekJoonAlgorithm.테스트;

import java.util.*;

public class 방번호 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        int[] plastic = new int[10];

        while (N>0){
            plastic[N%10]++;
            N /=10;
        }

        int ans  = (plastic[6]+plastic[9]+1)/2;
        for (int i = 0;i<9;i++){
            if ( i !=6) ans = Math.max(ans,plastic[i]);
        }

        System.out.println(ans);
    }
}
