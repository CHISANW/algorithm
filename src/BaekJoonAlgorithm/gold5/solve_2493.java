package BaekJoonAlgorithm.gold5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class solve_2493 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Tower> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i =1; i<=n;i++){
            int h = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek().height <= h){
                stack.pop();
            }

            if(stack.isEmpty()){
                sb.append(0).append(" ");
            }else{
                sb.append(stack.peek().index).append(" ");
            }

            stack.push(new Tower(h, i));
        }
        System.out.println(sb);

    }

    static class Tower {
        int height;
        int index;

        public Tower(int height, int index) {
            this.height = height;
            this.index = index;
        }
    }
}
