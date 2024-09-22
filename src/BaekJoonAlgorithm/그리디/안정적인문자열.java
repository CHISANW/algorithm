package BaekJoonAlgorithm.그리디;

import java.io.*;
import java.util.*;

public class 안정적인문자열 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st;

        int index = 1;
        while ((st = br.readLine()) != null) {
            if (st.contains("-")) {
                break;
            }

            Stack<Character> stack= new Stack<>();

            for (int i =0; i<st.length();i++){
                char now = st.charAt(i);
                if (stack.isEmpty()){
                    stack.push(now);
                }else{
                    Character peek = stack.peek();
                    if (now=='}'&& peek=='{'){
                            stack.pop();
                    }else {
                        stack.push(now);
                    }
                }
            }

            int count = 0;
            while (!stack.isEmpty()){
                char pop = stack.pop();
                char peek = stack.peek();
                if (pop == '{' && peek == '}'){
                    count+=2;
                    stack.pop();
                } else if (pop == '{' && peek == '{') {
                    count++;
                    stack.pop();
                } else if (pop=='}' && peek=='}') {
                    count++;
                    stack.pop();
                }
            }

            System.out.println(index++ +". "+ count);
        }

    }
}
