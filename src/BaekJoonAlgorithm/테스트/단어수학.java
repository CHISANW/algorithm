package BaekJoonAlgorithm.테스트;

import java.util.Arrays;
import java.util.Scanner;

public class 단어수학 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N= stdIn.nextInt();

        int [] alpha = new int[26];

        while (N-- >0){
            char[] word = stdIn.next().toCharArray();

            int initMul=1;
            for (int i =word.length-1;i>=0;i--){
                alpha[word[i]-'A'] +=initMul;
                initMul *=10;
            }
        }

        Arrays.sort(alpha);

        int ans= 0;

        for (int i =0;i<10;i++){
            ans+=alpha[25-i]*(9-i);
        }
        System.out.println(ans);
    }
}
