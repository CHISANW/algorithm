package BaekJoonAlgorithm.Re_silver.level4;

import java.util.*;

public class 카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>();
        for(int i = 1; i<=n;i++){
            dq.add(i);
        }

        while (dq.size() > 1){
            dq.removeFirst();
            dq.addLast(dq.pollFirst());
        }

        System.out.println(dq.pollFirst());

    }
}
