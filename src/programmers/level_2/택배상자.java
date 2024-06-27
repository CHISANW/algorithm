package programmers.level_2;

import java.util.*;

public class 택배상자 {
    public static void main(String[] args) {
        int[] order = {4,3,1,2,5};
        System.out.println(solution(order));        //result -> 2

        int[] order1= {5, 4, 3, 2, 1};
        System.out.println(solution(order1));       //result -> 2
    }

    public static int solution(int[] order){

        int answer= 0;

        Stack<Integer> stack = new Stack<>();
        Deque<Integer> dq = new LinkedList<>();

        for(int i =1; i< order.length; i++){
            dq.addLast(i);
        }

        int index = 0;

        while(!stack.isEmpty() || !dq.isEmpty()){
            if(!dq.isEmpty() && dq.peekFirst() == order[index]){
                dq.peekFirst();
                answer++;
                index++;
            }else if(!stack.isEmpty() && stack.peek() == order[index]){
                stack.pop();
                answer++;
                index++;
            }else if(!dq.isEmpty()){
                stack.push(dq.pollFirst());
            }else{
                break;
            }
        }
        return answer;
    }
}
