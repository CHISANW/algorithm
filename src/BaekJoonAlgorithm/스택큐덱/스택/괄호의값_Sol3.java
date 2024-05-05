package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.Scanner;

public class 괄호의값_Sol3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        char[] input = stdIn.next().toCharArray();

        int[] stack =new int[input.length];
        int topIndex = -1;
        int currentMultiple = 1;
        int ans =0;

        for (int i =0; i<input.length;i++){
            int delimiterValue = delimiterToValue(input[i]);
            if (input[i]=='(' || input[i] == '['){
                stack[++topIndex] = delimiterValue;
                currentMultiple *= delimiterValue;
            }
            else {
                if (topIndex<0 || stack[topIndex--] != delimiterValue){
                    ans = 0;
                    break;
                }
                if (input[i-1] == '(' || input[i-1] =='[')
                    ans += currentMultiple;
                currentMultiple /= delimiterValue;
            }
        }
        System.out.println(topIndex<0 ? ans : 0);
    }

    private static int delimiterToValue(char c) {

        if (c =='('|| c==')') return 2;
        if (c =='['|| c==']') return 3;
        else  return 0;
    }
}
