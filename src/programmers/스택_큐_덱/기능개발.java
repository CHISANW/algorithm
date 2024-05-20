package programmers.스택_큐_덱;

import java.util.*;

public class 기능개발 {
    public static void main(String[] args){

        int[] progress = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(solution(progress,speeds)));     //result -> [2, 1]

        int[] progress1 = {95, 90, 99, 99, 80, 99};
        int[] speeds1 = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(solution(progress1,speeds1))); //result - > [1, 3, 2]
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> answer = new  ArrayDeque<>();

        int n = progresses.length;
        int[] daysLeft = new int[n];
        for(int i=0;i<n;i++){
            int day = (100-progresses[i]);
            if( day % speeds[i] !=0) daysLeft[i] = day/speeds[i] +1;
            else daysLeft[i] =day/speeds[i];
        }

        int count = 0;
        int maxDay = daysLeft[0];

        for(int i =0;i<n;i++){
            if(daysLeft[i] <= maxDay){
                count++;
            }else{
                answer.add(count);
                count = 1;
                maxDay = daysLeft[i];
            }
        }

        answer.add(count);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
