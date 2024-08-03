package BaekJoonAlgorithm.문자열;

import java.util.*;
public class 문자열폭발 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String boom = sc.next();
        int boomLength = boom.length();
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        char boomLast = boom.charAt(boomLength-1);

        for(char c : input.toCharArray()){
            stack.push(c);

            if(c==boomLast && stack.size() >= boomLength){
                boolean check = true;
                for (int i =0; i<boomLength;i++){
                    if (stack.get(stack.size()- boomLength+i) != boom.charAt(i)){
                        check = false;
                        break;
                    }
                }

                if (check){
                    for(int i =0;i<boomLength;i++){
                        stack.pop();
                    }
                }
            }
        }

        if (stack.isEmpty()){
            System.out.println("FRULA");
        }else{
            while (!stack.isEmpty()){
                sb.append(stack.pop());
            }
        }

        System.out.println(sb.reverse());
    }
}
