package BaekJoonAlgorithm.silver2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class solve_28066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 1; i<=n;i++){
            deque.add(i);
        }

        if(deque.size() < k){
            System.out.println(1);
            return;
        }

        while (deque.size() > k){
            Integer poll = deque.poll();

            for(int i =1; i<k;i++){
                if(!deque.isEmpty()){
                    deque.poll();
                }
            }
            deque.add(poll);
        }

        System.out.println(deque.peek());
    }
}
