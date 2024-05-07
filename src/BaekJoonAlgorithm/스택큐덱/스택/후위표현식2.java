package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.Scanner;

public class 후위표현식2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();

        char[] charArray = stdIn.next().toCharArray();
        int[] value = new int[N];
        for (int i=0;i<N;i++){
            value[i] = stdIn.nextInt();
        }

        double[] stack = new double[charArray.length];
        int stackIndex = -1;
        for (char ch : charArray){
            if ('A' <= ch && ch <='Z'){
                stack[++stackIndex] = value[ch-'A'];
            }else{
                double result = stack[stackIndex-1];
             if (ch=='+') result+= stack[stackIndex];
             else if (ch=='-') result -= stack[stackIndex];
             else if (ch =='*') result *= stack[stackIndex];
             else if (ch=='/') result /= stack[stackIndex];
             stack[--stackIndex] = result;
            }
        }
        System.out.printf("%.2f",stack[0]);
    }
}
