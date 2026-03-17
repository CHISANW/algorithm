package BaekJoonAlgorithm.Re_silver.level4;

import java.io.BufferedReader;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i =0;i<k;i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(num);
            }
        }

        int sum = 0;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }


}
