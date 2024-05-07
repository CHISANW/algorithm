package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.Scanner;

public class 좋은단어 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int ans =0;
        while (N-->0){
            char[] charArray = stdIn.next().toCharArray();

            char[] stack = new char[charArray.length];
            int stackIndex = -1;

            for (char ch : charArray){
                stack[++stackIndex] = ch;
                if (stackIndex>0 && stack[stackIndex-1]==ch){
                    stackIndex-=2;
                }
            }
            if (stackIndex==-1) ans++;
        }
        System.out.println(ans);
    }
}
