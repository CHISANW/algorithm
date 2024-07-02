package programmers.level_2;

import java.util.*;
public class 다리를지나는트럭 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight =100;
        int[] truck_weights = {7,4,5,6};
        System.out.println(solution(bridge_length,weight,truck_weights));   //result -> 	8

        int bridge_length1 = 100;
        int weight1 =100;
        int[] truck_weights1 = {10};
        System.out.println(solution(bridge_length1,weight1,truck_weights1));   //result -> 	101

        int bridge_length2 = 100;
        int weight2 =100;
        int[] truck_weights2 = {10,10,10,10,10,10,10,10,10,10};
        System.out.println(solution(bridge_length2,weight2,truck_weights2));   //result -> 	110
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for(int truck : truck_weights) {

            while(true) {
                if(queue.isEmpty()) {
                    queue.add(truck);
                    sum += truck;
                    time++;
                    break;
                } else if(queue.size() == bridge_length) {
                    sum -= queue.poll();
                } else  {
                    if(sum + truck <= weight) {
                        queue.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        queue.add(0);
                        time++;
                    }
                }
            }
        }

        return time + bridge_length;
    }
}
