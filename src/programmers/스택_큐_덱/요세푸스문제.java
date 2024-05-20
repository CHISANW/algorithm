package programmers.스택_큐_덱;

import java.util.*;

public class 요세푸스문제 {
    public static void main(String[] args) {

        int n =5;
        int k =2;
        System.out.println(solution(n,k)); //result -> 3

    }

    public static int solution(int n, int k) {
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i =1;i<=n;i++){
            queue.addLast(i);
        }
        while(queue.size()!=1){
            for(int i=0;i<k-1;i++) {
                int poll = queue.pollFirst();
                queue.addLast(poll);
            }
            queue.pollFirst();
        }
        return queue.pollFirst();
    }
}
