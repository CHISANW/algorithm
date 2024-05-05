package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.Scanner;

public class PPAP {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        char[] input = stdIn.next().toCharArray();

        char[] stack = new char[input.length];
        int stackIndex = 0;
        for (char ch : input){
            stack[stackIndex++] = ch;
            if (stackIndex>=4  && stack[stackIndex-1]=='P' && stack[stackIndex-2]=='A'
                    &&stack[stackIndex-3]=='P'&&stack[stackIndex-4]=='P')
                stackIndex -= 3;
        }

        System.out.println(stack[0]=='P'&& stackIndex==1 ? "PPAP" : "NP");
    }
}
