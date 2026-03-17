package BaekJoonAlgorithm.Re_silver.level4;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String type = st.nextToken();
            if(type.equals("push")){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(type.equals("pop")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(stack.pop()).append("\n");
                }
            }else if(type.equals("size")){
                sb.append(stack.size()).append("\n");
            }
            else if(type.equals("empty")){
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            }
            else if(type.equals("top")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }

}
