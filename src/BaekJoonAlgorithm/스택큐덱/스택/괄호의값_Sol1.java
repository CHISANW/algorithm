package BaekJoonAlgorithm.스택큐덱.스택;

import java.util.Scanner;

public class 괄호의값_Sol1 {

    public static class Element{
        enum Type {DELIMITER, SCORE}
        Type type;
        int value;

        public Element(Type type, int value) {
            this.type = type;
            this.value = value;
        }
    }

    public  static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        char[] input = stdIn.next().toCharArray();

        Element[] stack=  new Element[31];
        int stackIndex =-1;

        if (!isValidInput(input)){
            System.out.println(0);
            return;
        }

        for (char ch : input){
            if (ch=='(' || ch=='['){
                stack[++stackIndex] = new Element(Element.Type.DELIMITER,delimiterToValue(ch));
            }else{
                int innerScore = 0;
                while (stack[stackIndex].type == Element.Type.SCORE){
                    innerScore += stack[stackIndex--].value;
                }
                int score =  innerScore * delimiterToValue(ch);
                if (score == 0) score = delimiterToValue(ch);
                stack[stackIndex] = new Element(Element.Type.SCORE,score);
            }
        }

        int ans = 0;
        while (stackIndex >= 0){
            ans+= stack[stackIndex--].value;
        }
        System.out.println(ans);


    }

    private static int delimiterToValue(char ch) {
        if (ch=='(' || ch==')') return 2;
        if (ch=='[' || ch ==']')return 3;
        return 0;
    }

    private static boolean isValidInput(char[] input) {
        char[] stack = new char[input.length];
        int stackIndex = -1;
        for (char ch : input){
            if (ch == '(' || ch=='[')
                stack[++stackIndex] = ch;
            else{
                if (stackIndex < 0) return false;
                if (delimiterToValue(ch) != delimiterToValue(stack[stackIndex])){
                    return false;
                }
                stackIndex--;
            }
        }
        return stackIndex<0;
    }


}
