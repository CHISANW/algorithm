package programmers.level_2;

import java.util.*;
public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(solution(priorities,location)); // result -> 1

    }
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Deque<Process> dq = new ArrayDeque<>();
        int max = 0;

        for(int i =0; i<priorities.length;i++){
            max = Math.max(max,priorities[i]);
            dq.addLast(new Process(i,priorities[i]));
        }

        int index = 0;
        while(!dq.isEmpty()){
            Process pc = dq.pollFirst();

            if(pc.priority >= max){
                index++;
                if(pc.order == location){
                    answer = index;
                    break;
                }
                max = findMaxPriority(dq);
            }else{
                dq.addLast(pc);
            }

        }

        return answer;
    }

    private static int findMaxPriority(Deque<Process> dq) {
        int max = 0;
        for (Process p : dq) {
            max = Math.max(max, p.priority);
        }
        return max;
    }
    static class Process{
        int order;
        int priority;

        public Process(int order, int priority){
            this.order = order;
            this.priority=priority;
        }
    }
}
