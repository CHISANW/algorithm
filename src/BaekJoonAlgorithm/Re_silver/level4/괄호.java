package BaekJoonAlgorithm.Re_silver.level4;

import java.io.BufferedReader;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            Stack<Character> stack = new Stack<>();
            String line = br.readLine();
            for(char c : line.toCharArray()){
                if(stack.isEmpty()){
                    stack.push(c);
                    continue;
                }

                Character now = stack.peek();
                if(c==')') {
                    if(now.equals('(')){
                        stack.pop();
                    }
                }else{
                    stack.push(c);
                }
            }
            sb.append(stack.isEmpty() ? "YES": "NO").append("\n");
        }
        System.out.println(sb);
    }
}
