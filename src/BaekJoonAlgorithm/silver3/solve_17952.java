package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class solve_17952 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Task> stack = new Stack<>();
        int result = 0;
        for(int i = 0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            if(cmd == 1){
                int score = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                stack.push(new Task(score,time));
            }

            if(!stack.isEmpty()){
                Task now = stack.peek();
                now.count--;

                if(now.count == 0){
                    stack.pop();
                    result += now.score;
                }
            }
        }
        System.out.println(result);
    }

    static class Task {
        int score;
        int count;

        public Task(int score, int count) {
            this.score = score;
            this.count = count;
        }
    }
}
